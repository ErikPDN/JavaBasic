package challenges.sockets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClientHandler implements Runnable {
    private Socket client;

    public ClientHandler(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            // Define o nome do arquivo de destino
            Path path = Paths.get("src/challenges/sockets/");
            String absolutePath = path.toAbsolutePath().toString();
            Path filePath = Paths.get(absolutePath, "received_" + client.getInetAddress().getHostAddress() + ".txt");

            // Prepara para escrever o arquivo no disco
            FileOutputStream fileOut = new FileOutputStream(filePath.toString());
            InputStream inputStream = client.getInputStream();

            // Buffer para ler o conteúdo do arquivo enviado pelo cliente
            byte[] buffer = new byte[4096];
            int bytesRead;

            // Lê o conteúdo do cliente e escreve no arquivo
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                fileOut.write(buffer, 0, bytesRead);
            }

            System.out.println("Arquivo recebido com sucesso de " + client.getInetAddress().getHostAddress());

            // Fecha os recursos
            fileOut.close();
            inputStream.close();
            client.close();

        } catch (IOException e) {
            System.err.println("Erro ao processar a conexão com o cliente: " + e.getMessage());
        }
    }
}
