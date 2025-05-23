package Lektion17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Streamverdopplung extends OutputStream {
    private final OutputStream out1;
    private final OutputStream out2;

    public Streamverdopplung(OutputStream out1, OutputStream out2) {
        this.out1 = out1;
        this.out2 = out2;
    }

    @Override
    public void write(int b) throws IOException {
        IOException exception1 = null;
        IOException exception2 = null;

        try {
            out1.write(b);
        } catch (IOException e) {
            exception1 = e;
            e.printStackTrace();
        }

        try {
            out2.write(b);
        } catch (IOException e) {
            exception2 = e;
            e.printStackTrace();
        }

        if (exception1 != null && exception2 != null) {
            throw new IOException("Fehler in beiden streams");
        }

        if (exception1 != null) {
            throw new IOException("Fehler beim Schreiben von Output 1" + exception1);
        }

        if (exception2 != null) {
            throw new IOException("Fehler beim Schreiben von Output 2" + exception2);
        }
    }

    @Override
    public void close() throws IOException {
        IOException exception1 = null;
        IOException exception2 = null;

        try {
            out1.close();
        } catch (IOException e) {
            exception1 = e;
            e.printStackTrace();
        }

        try {
            out2.close();
        } catch (IOException e) {
            exception2 = e;
            e.printStackTrace();
        }

        if (exception1 != null && exception2 != null) {
            throw new IOException("Fehler in beiden streams");
        }

        if (exception1 != null) {
            throw new IOException("Fehler beim Schließen von Output 1" + exception1);
        }

        if (exception2 != null) {
            throw new IOException("Fehler beim Schließen von Output 2" + exception2);
        }
    }

    public static void main(String[] args){
        try(FileOutputStream file1 = new FileOutputStream("file1.txt");
            FileOutputStream file2 = new FileOutputStream("file2.txt");
            Streamverdopplung doppel = new Streamverdopplung(file1, file2)) {

            String eingabe = "Hallo Welt";
            byte[] bytes = eingabe.getBytes();
            for (int i = 0; i <= bytes.length; i++) {
                byte b = bytes[i];
            doppel.write(b);
            }
            doppel.close();
           }catch(IOException e){
                e.printStackTrace();
        }
    }
}

