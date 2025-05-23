package Lektion19.Hangman2;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket("localhost", 5000);
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                Scanner scanner = new Scanner(System.in)
        ) {
            while (true) {
                System.out.print("Buchstabe raten: ");
                char buchstabe = scanner.nextLine().toUpperCase().charAt(0);

                out.writeObject(new Lektion19.Hangman2.Client_Logic(buchstabe));
                out.flush();

                Reply antwort = (Reply) in.readObject();

                System.out.println("Wort: " + antwort.anzeige);
                System.out.println("Treffer: " + antwort.treffer);
                System.out.println("Verbleibende Versuche: " + antwort.verbleibendeVersuche);

                if (antwort.spielBeendet) {
                    if (antwort.wortErraten) {
                        System.out.println("Gewonnen!");
                    } else {
                        System.out.println("Verloren!");
                    }
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Fehler im Client: " + e.getMessage());
        }
    }
}


