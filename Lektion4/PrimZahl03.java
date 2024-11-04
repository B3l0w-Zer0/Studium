package Lektion4;
import java.util.Scanner;

public class PrimZahl03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte zu untersuchende Zahl eingeben: ");
        int zahl = scanner.nextInt();
        int anzahlZähler = 0;

        if (zahl <= 1) {
            System.out.println("Untersuchte Zahl ist keine Primzahl!");
            return;
        }

        for (int i = 1; i <= zahl; i++) {
            if (zahl % i == 0) {
                anzahlZähler++;
            }
        }

        if (anzahlZähler == 2) {
            System.out.println("Untersuchte Zahl ist eine Primzahl!");
        } else {
            System.out.println("Untersuchte Zahl ist keine Primzahl!");
        }
    }
}
