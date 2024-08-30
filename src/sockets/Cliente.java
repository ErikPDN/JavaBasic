package sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket client = new Socket("127.0.0.1", 8080);
        System.out.println("Cliente conectado com sucesso!");

        Scanner keyboard = new Scanner(System.in);
        PrintStream out = new PrintStream(client.getOutputStream());

        while(keyboard.hasNextLine()) {
            out.println(keyboard.nextLine());
        }

        out.close();
        keyboard.close();
        client.close();

    }
}
