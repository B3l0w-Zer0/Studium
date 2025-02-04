package Lektion3;
import java.util.Scanner;

public class Matrikelnummer05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Matrikelnummer ein: ");
        String matrikelnummer = scanner.next();

        boolean istGueltig = true;

        // Überprüfen, ob die Matrikelnummer siebenstellig ist
        if (matrikelnummer.length() != 7) {
            istGueltig = false;
            System.out.println("Ungültige Matrikelnummer: Falsche Anzahl an Stellen.");
        } else {
            // Überprüfen, ob die Matrikelnummer mit 50, 51 oder 61 beginnt
            char ersteZiffer = matrikelnummer.charAt(0);
            char zweiteZiffer = matrikelnummer.charAt(1);

            if (ersteZiffer == '5' && (zweiteZiffer == '0' || zweiteZiffer == '1') || (ersteZiffer == '6' && zweiteZiffer == '1')) {
                for (int i = 2; i < 7; i++) {
                    char ziffer = matrikelnummer.charAt(i);
                    if (ziffer < '0' || ziffer > '9') {
                        istGueltig = false;
                        break;
                    }
                }

                if (istGueltig) {
                    System.out.println("Gültige Matrikelnummer.");
                } else {
                    System.out.println("Ungültige Matrikelnummer: Enthält ungültige Zeichen.");
                }
            } else {
                System.out.println("Ungültige Matrikelnummer: Falscher Studiengangspräfix.");
            }
        }

        scanner.close();
    }
}
