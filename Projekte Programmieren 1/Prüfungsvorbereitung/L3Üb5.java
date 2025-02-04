package Prüfungsvorbereitung;
import java.util.Scanner;

public class L3Üb5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean gueltig = true;
        String matr = scanner.next();

        if (matr.length() != 7){
            gueltig = false;
            System.out.println("Verpiss dich du Huen");
        }
        else {

            char ersteZiffer = matr.charAt(0);
            char zweiteZiffer = matr.charAt(1);

            if (ersteZiffer == '5' && (zweiteZiffer == '0' || zweiteZiffer == '1') || (ersteZiffer == '6' && zweiteZiffer == '1')) {
                for (int i = 2; i < 7; i++) {
                    char ziffer = matr.charAt(i);
                    if (ziffer < '0' || ziffer > '9') {
                        gueltig = false;
                        break;
                    }
                }

                if (gueltig) {
                    System.out.println("Gültige Matrikelnummer.");
                } else {
                    System.out.println("Ungültige Matrikelnummer: Enthält ungültige Zeichen.");
                }
            } else {
                System.out.println("Ungültige Matrikelnummer: Falscher Anfang.");
            }
        }

        scanner.close();
    }
}