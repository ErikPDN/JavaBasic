package challenges.sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 12345);
        System.out.println("Client connected to server");

        Scanner keyboard = new Scanner(System.in);
        PrintStream out = new PrintStream(client.getOutputStream());

        // Thread para receber mensagens do servidor
        new Thread(() -> {
            try{
                Scanner in = new Scanner(client.getInputStream());

                while (in.hasNextLine()) {
                    System.out.println("Mensagem recebida: " + in.nextLine());
                }
                in.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }).start();

        // Envia mensagens do teclado
        while (keyboard.hasNextLine()) {
            out.println(keyboard.nextLine());
        }

        out.close();
        keyboard.close();
        client.close();
    }
}
