package Lektion22.MultithreadServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class TCPServer extends Thread {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server läuft auf Port 1234 ...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client verbunden: " + clientSocket.getInetAddress());

                // Neuen Thread starten, der den Client verarbeitet
                new ClientHandler(clientSocket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
            ) {
                String input = in.readLine(); // Erwartet Liste von Zahlen z. B.: "3,5,8,13"
                List<Integer> zahlen = parseZahlen(input);
                Map<Integer, Boolean> ergebnis = new LinkedHashMap<>();

                for (int zahl : zahlen) {
                    ergebnis.put(zahl, istPrim(zahl));
                }

                out.println("Antwort vom Server:");
                for (Map.Entry<Integer, Boolean> entry : ergebnis.entrySet()) {
                    out.println(entry.getKey() + " -> " + (entry.getValue() ? "Primzahl" : "keine Primzahl"));
                }

                socket.close();
                System.out.println("Verbindung zu Client geschlossen");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private List<Integer> parseZahlen(String eingabe) {
            List<Integer> liste = new ArrayList<>();
            if (eingabe != null) {
                for (String s : eingabe.split(",")) {
                    try {
                        liste.add(Integer.parseInt(s.trim()));
                    } catch (NumberFormatException ignored) {}
                }
            }
            return liste;
        }
        private boolean istPrim(int zahl) {
            if (zahl < 2) return false;
            for (int i = 2; i <= Math.sqrt(zahl); i++) {
                if (zahl % i == 0) return false;
            }
            return true;
        }
    }
}
