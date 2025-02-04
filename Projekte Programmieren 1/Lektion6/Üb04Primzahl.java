package Lektion6;
import java.util.Scanner;

public class Üb04Primzahl {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bitte zu untersuchende Zahl eingeben: ");
            System.out.println(primzahl(scanner.nextInt()));
        }
        public static boolean primzahl(int zahl){
            boolean primzahl = true;
            int anzahlZähler = 0;

            if (zahl <= 1) {
                primzahl = false;
                return primzahl;
            }

            for (int i = 1; i <= zahl; i++) {
                if (zahl % i == 0) {
                    anzahlZähler++;
                }
            }

            if (anzahlZähler == 2) {
                primzahl = true;
                return primzahl;

            } else {
                primzahl = false;
            }
            return primzahl;
        }
    }
