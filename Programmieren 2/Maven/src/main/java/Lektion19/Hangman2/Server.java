package Lektion19.Hangman2;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        final int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server gestartet auf Port " + port);

            try (
                    Socket socket = serverSocket.accept();
                    ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream in = new ObjectInputStream(socket.getInputStream())
            ) {
                Server_Logic spiel = new Server_Logic("BANANE");

                while (true) {
                   Client_Logic eingabe = (Client_Logic) in.readObject();
                    Reply antwort = spiel.verarbeite(eingabe);

                    out.writeObject(antwort);
                    out.flush();

                    if (antwort.spielBeendet) {
                        System.out.println("Spiel beendet.");
                        break;
                    }
                }

            } catch (ClassNotFoundException e) {
                System.err.println("Fehler beim Lesen des Objekts: " + e.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Serverfehler: " + e.getMessage());
        }
    }
}
