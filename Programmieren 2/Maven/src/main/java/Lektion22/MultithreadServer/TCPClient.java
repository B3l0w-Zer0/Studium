package Lektion22.MultithreadServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Gib eine Liste von Zahlen ein (z. B. 3, 5, 8, 13):");
            String eingabe = scanner.nextLine();
            out.println(eingabe); // an Server senden

            //System.out.println("Antwort vom Server:");
            String zeile;
            while ((zeile = in.readLine()) != null) {
                System.out.println(zeile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

