package Lektion18.GZipOPS;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.zip.GZIPInputStream;

public class Server {
    public static final int PORT = 5555;
    public static void main(String[] args) {
        try (ServerSocket socket = new ServerSocket(PORT);
             Socket sock = socket.accept();
             GZIPInputStream stream = new GZIPInputStream(sock.getInputStream())) {

            System.out.println(new String(stream.readAllBytes()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
