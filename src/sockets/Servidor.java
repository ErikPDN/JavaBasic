package sockets;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) throws IOException {
        // Cria um servidor indicado pela porta na instância(no caso a 8080)
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Servidor criado com sucesso!");

        Socket client = serverSocket.accept();
        System.out.println("Nova conexão com o cliente " +
                client.getInetAddress().getHostAddress()
        );

        Scanner scanner = new Scanner(client.getInputStream());
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
        serverSocket.close();
        client.close();
    }
}
