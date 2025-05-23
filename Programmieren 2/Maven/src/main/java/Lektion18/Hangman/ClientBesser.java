package Lektion18.Hangman;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientBesser {
    public static void main(String[] args) {
        final String serverAddress = "localhost"; // Server-Adresse ändern, wenn nötig
        final int port = 8161;

        try (Socket socket = new Socket(serverAddress, port);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Verbunden mit dem Hangman-Server!");

            String response;
            while ((response = reader.readLine()) != null) {
                //System.out.println(response);

                if (response.startsWith("Spiel vorbei!") || response.startsWith("Glückwunsch!")) {
                    break;
                }

                String output = reader.readLine();
                System.out.print(output);
                String input = scanner.nextLine();

                if (input.length() == 1) {
                    writer.write(input);
                    writer.newLine();
                    writer.flush();
                } else {
                    System.out.println("Bitte gib nur einen einzelnen Buchstaben ein. Du hast verloren");
                }
            }

            System.out.println("Verbindung zum Server geschlossen.");
        } catch (Exception e) {
            System.err.println("Fehler beim Verbinden mit dem Server: " + e.getMessage());
        }
    }
}

