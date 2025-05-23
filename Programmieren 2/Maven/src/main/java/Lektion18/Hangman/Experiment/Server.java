package Lektion18.Hangman.Experiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static int tries = 15;
    static boolean finish = false;
    public static void main(String[] args) {
        final int port = 8167;


        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server läuft auf Port: " + port);

            while (true) {
                try (
                        Socket clientSocket = serverSocket.accept();
                        InputStreamReader is = new InputStreamReader(clientSocket.getInputStream());
                        BufferedReader reader = new BufferedReader(is);
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))
                ) {
                    System.out.println("Ein Client hat sich verbunden.");

                    while (tries >= 0) {
                        String[] dictionary = new String[]{
                                "Zephyr", "Lantern", "Harmony", "Cascade", "Velvet", "Orbit", "Whisker", "Echo", "Quicksand", "Mirage", "Ember", "Twilight", "Nimbus", "Flicker", "Mosaic", "Driftwood", "Galaxy", "Solstice", "Meadow", "Quiver"
                        };
                        char[] word = dictionary[(int) (Math.random() * dictionary.length)].toLowerCase().toCharArray();
                        // we only have this many tries
                        char[] input = new char[tries];
                        writer.write("Gesucht ist: " + String.valueOf(build_try(input, word)));
                        writer.newLine();
                        writer.flush();
                        for (int i = 0; i < tries; i++) {
                            input[i] = reader.readLine().charAt(0);
                            System.out.println(input[i]);
                            writer.write((i + 1) + ". Versuch: " + String.valueOf(build_try(input, word)));
                            if (finish) {
                                writer.write("Final solution after " + (i + 1) + " tries: " + String.valueOf(build_try(input, word)));
                                writer.newLine();
                                writer.flush();
                                break;
                            }

                        }
                    }


                    String input = reader.readLine();
                    while (input != null) {
                        if (input.equalsIgnoreCase("break")) {
                            break;
                        }

                        writer.write("OK!");
                        writer.newLine();
                        writer.flush();
                    }

                    System.out.println("Verbindung zum Client geschlossen.");
                } catch (Exception e) {
                    System.err.println("Fehler beim Verarbeiten eines Clients: " + e.getMessage());
                }

            }

        } catch (Exception e) {
            System.err.println("Fehler beim Starten des Servers: " + e.getMessage());
        }
    }
        private static char[] build_try ( char[] input, char[] word){
            char[] out = new char[word.length];
            boolean input_missing = false;
            for (int i = 0; i < word.length; i++) {
                if (contains(word[i], input)) {
                    out[i] = word[i];
                } else {
                    input_missing = true;
                    out[i] = '_';
                }
            }
            if (!input_missing) finish = true;
            return out;
        }

        private static boolean contains ( char needle, char[] haystack){
            for (int i = 0; i < haystack.length; i++) {
                if (needle == haystack[i]) return true;
            }
            return false;
        }
    }


