package challenges.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");

        Socket cliente = serverSocket.accept();
        System.out.println("Nova conexão com o cliente " +
                cliente.getInetAddress().getHostAddress()
        );

        Path path = Paths.get("src/challenges/sockets/received.txt");

        InputStream inputStream = cliente.getInputStream();

        // Escreve o conteúdo recebido diretamente no arquivo
        Files.copy(inputStream, path);

        inputStream.close();
        serverSocket.close();

    }
}
