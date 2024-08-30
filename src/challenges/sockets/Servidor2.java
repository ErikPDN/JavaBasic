package challenges.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Porta 1234 aberta!");

        while (true) {
            Socket cliente = serverSocket.accept();
            System.out.println("Nova conexão com o cliente " +
                    cliente.getInetAddress().getHostAddress()
            );

            new Thread(new ClientHandler(cliente)).start();
        }
    }
}
