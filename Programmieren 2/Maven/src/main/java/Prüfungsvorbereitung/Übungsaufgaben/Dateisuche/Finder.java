package Prüfungsvorbereitung.Übungsaufgaben.Dateisuche;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Finder {
    public BufferedReader getSystemInAsBufferedReader(){
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public void findStringInFiles(String searchString, String[] filenames) {
        for (String filename : filenames) {
            try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
                String line;
                int lineNumber = 1;
                while ((line = fileReader.readLine()) != null) {
                    if (line.contains(searchString)) {
                        System.out.println("Hab deinen scheiß String gefunden du Fotze in der Zeile: " + lineNumber);
                    }
                    lineNumber++;
                }

            } catch (IOException e) {
                System.out.println("Halt die Fresse");
            }
        }
    }

    public static void main(String[] args){
        Finder Dora = new Finder();
        BufferedReader br = Dora.getSystemInAsBufferedReader();
        String searchString = null;
        try{
            searchString = br.readLine();
            Dora.findStringInFiles(searchString, args);
            br.close();
        } catch (IOException ex) {
            System.out.println("Einlesen fehlgeschlagen.");
        };
    }
}
