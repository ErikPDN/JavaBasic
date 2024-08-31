package challenges.sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servidor3 {
    private static final List<PrintStream> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");

        while (true) {
            // Aceita uma nova conexão com o cliente
            Socket client = serverSocket.accept();
            System.out.println("Nova conexão com o cliente " +
                    client.getInetAddress().getHostAddress()
            );

            // Cria um PrintStream para o novo cliente e adiciona à lista
            PrintStream out = new PrintStream(client.getOutputStream());
            synchronized (clients) {
                clients.add(out);
            }

            // Cria uma nova thread para tratar o cliente
            new Thread(new ClientHandler2(client)).start();
        }

    }

    private static void enviaParaTodos(String msg) {
        synchronized (clients) {
            for (PrintStream client : clients) {
                client.println(msg);
            }
        }
    }

    private static class ClientHandler2 implements Runnable {
        private Socket client;

        public ClientHandler2(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            try(Scanner in = new Scanner(client.getInputStream())){
                while(in.hasNextLine()){
                    String message = in.nextLine();
                    System.out.println("Recebido: " + message);
                    enviaParaTodos(message);
                }
            } catch(IOException e){
                System.out.println("Erro: " + e.getMessage());
            } finally {
                try {
                    client.close();
                } catch (IOException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }
    }

}
