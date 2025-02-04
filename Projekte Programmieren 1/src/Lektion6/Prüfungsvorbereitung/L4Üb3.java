package Prüfungsvorbereitung;
import java.util.Scanner;

public class L4Üb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte zu untersuchende Zahl eingeben: ");
        int zahl = scanner.nextInt();
        int zähler = 0;
        int zähler2 = 0;

        if (zahl <= 1) {
            System.out.println("Untersuchte Zahl ist keine Primzahl!");
        }

        for (int j = 1; j <= zahl; j++) {
            for (int i = 1; i <= zahl; i++) {
                if (zahl % i == 0) {
                    zähler++;
                }
                if (j % i == 0) {
                    zähler2++;
                }
            }
            if (zähler2 == 2) {
                System.out.println("Untersuchte Zahl " + j + " ist eine Primzahl");
            } else{
                System.out.println("Untersuchte Zahl " + j + " ist keine Primzahl");
            }
            zähler2 = 0;
        }

            if (zähler == 2) {
                System.out.println("Untersuchte Zahl ist eine Primzahl!");
            } else {
                System.out.println("Untersuchte Zahl ist keine Primzahl!");
            }
        }
    }




