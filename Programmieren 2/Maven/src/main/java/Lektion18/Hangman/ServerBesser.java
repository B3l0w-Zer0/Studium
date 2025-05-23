package Lektion18.Hangman;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import static java.lang.Math.abs;

public class ServerBesser {
    static int tries = 15;
    static boolean finish = false;

    public static void main(String[] args) {
        final int port = 8161;
        String[] dictionary = new String[]{
                "Zephyr", "Lantern", "Harmony", "Cascade", "Velvet", "Orbit", "Whisker", "Echo", "Quicksand", "Mirage",
                "Ember", "Twilight", "Nimbus", "Flicker", "Mosaic", "Driftwood", "Galaxy", "Solstice", "Meadow", "Quiver"
        };

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server läuft auf Port: " + port);

            while (true) {
                try (
                        Socket clientSocket = serverSocket.accept();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))
                ) {
                    System.out.println("Ein Client hat sich verbunden.");

                    char[] word = dictionary[(int) (Math.random() * dictionary.length)].toLowerCase().toCharArray();
                    char[] guessedLetters = new char[word.length];
                    Arrays.fill(guessedLetters, '_');

                    writer.write("Gesuchtes Wort: " + String.valueOf(guessedLetters));
                    writer.newLine();
                    writer.flush();

                    while (tries >= 0 && !finish) {
                            writer.write("Versuch Nr. " + (16 - tries) + " Gesuchtes Wort: " + String.valueOf(guessedLetters) + "! Gib einen Buchstaben ein: ");
                            writer.newLine();
                            writer.flush();

                            String input = reader.readLine();
                            if (input == null || input.isEmpty()) continue;
                            char guess = input.charAt(0);

                            updateGuessedLetters(guess, guessedLetters, word);
                            writer.write("Versuch " + (16 - tries) + ": " + String.valueOf(guessedLetters));
                            writer.newLine();
                            writer.flush();

                            if (finish) {
                                writer.write("Glückwunsch! Du hast das Wort erraten: " + String.valueOf(word));
                                writer.newLine();
                                writer.flush();
                                break;
                            }
                            tries--;
                    }

                    writer.write("Spiel vorbei! Das Wort war: " + String.valueOf(word));
                    writer.newLine();
                    writer.flush();
                    System.out.println("Verbindung zum Client geschlossen.");
                } catch (Exception e) {
                    System.err.println("Fehler beim Verarbeiten eines Clients: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.err.println("Fehler beim Starten des Servers: " + e.getMessage());
        }
    }

    private static void updateGuessedLetters(char guess, char[] guessedLetters, char[] word) {
        boolean found = false;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == guess) {
                guessedLetters[i] = guess;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Falscher Buchstabe!");
        }
        finish = !new String(guessedLetters).contains("_");
    }
}

