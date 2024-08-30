package challenges.sockets;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) throws IOException, UnknownHostException {
        Socket client = new Socket("127.0.0.1", 12345);
        System.out.println("Client connected to server");

        // Lê o path para o arquivo
        Path path = Paths.get("src/challenges/sockets/file.txt");

        // Lê all o conteudo do arquivo em um byte array
        byte[] fileContent = Files.readAllBytes(path);

        // Envia o conteúdo
        OutputStream output = client.getOutputStream();
        output.write(fileContent);

        System.out.println("Sending file to server");

        output.close();
        client.close();
    }
}
