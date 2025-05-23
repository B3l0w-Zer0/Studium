package Lektion17;

import java.io.*;

public class Zeitmessung {
    /*    long startTime = System.currentTimeMillis();
        //Code, dessen Dauer gemessen werden soll
    //…
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
    */
    public static void main(String[] args) {

        try {
            long startTime = System.currentTimeMillis();
            copyFileUnbuffered("musictest-copy2.mp3", "musictest-copy2_unbuffered.mp3");
            System.out.println("Datei wurde erfolgreich kopiert.");
            long endTime = System.currentTimeMillis();
            System.out.println("Ungepufferte Kopie dauerte: " + (endTime - startTime) + " ms");
        } catch (FileNotFoundException e) {
            System.out.println("Fehler: Datei nicht gefunden - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Fehler: Ein-/Ausgabefehler - " + e.getMessage());
        }


        try {
            long startTime = System.currentTimeMillis();
            copyFileBuffered("musictest-copy2.mp3", "musictest-copy2_buffered.mp3");
            System.out.println("Datei wurde erfolgreich kopiert.");
            long endTime = System.currentTimeMillis();
            System.out.println("Gepufferte Kopie dauerte: " + (endTime - startTime) + " ms");
        } catch (FileNotFoundException e) {
            System.out.println("Fehler: Datei nicht gefunden - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Fehler: Ein-/Ausgabefehler - " + e.getMessage());
        }

        try {
            long startTime = System.currentTimeMillis();
            copyFileWithBuffer("musictest-copy2.mp3", "musictest-copy2_buffer1024.mp3");
            System.out.println("Datei wurde erfolgreich kopiert.");
            long endTime = System.currentTimeMillis();
            System.out.println("Kopie mit byte[]-Puffer dauerte: " + (endTime - startTime) + " ms");
        } catch (FileNotFoundException e) {
            System.out.println("Fehler: Datei nicht gefunden - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Fehler: Ein-/Ausgabefehler - " + e.getMessage());
        }
    }

        public static void copyFileUnbuffered (String sourcePath, String destinationPath) throws IOException {
            try (FileInputStream fis = new FileInputStream(sourcePath);
                 FileOutputStream fos = new FileOutputStream(destinationPath)) {
                int byteData;
                while ((byteData = fis.read()) != -1) {
                    fos.write(byteData);
                }
            }
        }

        public static void copyFileBuffered (String sourcePath, String destinationPath) throws IOException {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationPath))) {
                int byteData;
                while ((byteData = bis.read()) != -1) {
                    bos.write(byteData);
                }
            }
        }

        public static void copyFileWithBuffer (String sourcePath, String destinationPath) throws IOException {
            try (FileInputStream fis = new FileInputStream(sourcePath);
                 FileOutputStream fos = new FileOutputStream(destinationPath)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }
        }
    }


