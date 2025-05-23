package Lektion18.Hangman.Experiment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client{
    public static void main(String[]args){
        final int port = 8161;
        final String host = "localhost";

        try(Socket socket = new Socket(host, port);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner sc = new Scanner(System.in))
        {

            String GesuchtIst = br.readLine();
            System.out.println(GesuchtIst);
            while (true){
                String antwort = sc.nextLine();
                bw.write(antwort);
                if (antwort.equalsIgnoreCase("break")){
                    break;
                }
                bw.newLine();
                bw.flush();

                String versuch = br.readLine();
                System.out.println(versuch);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
