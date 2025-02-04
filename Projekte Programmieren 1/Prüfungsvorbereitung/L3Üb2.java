package Prüfungsvorbereitung;
import java.util.Scanner;

public class L3Üb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib 1. Durchmesser ein");
        int d1 = scanner.nextInt();
        System.out.println("Gib 2. Durchmesser ein");
        int d2 = scanner.nextInt();
        System.out.println("Gib 1. Preis");
        int p1 = scanner.nextInt();
        System.out.println("Gib 2. Preis");
        int p2 = scanner.nextInt();

        int Fl1 = (int) (((d1 / 2) * (d1 / 2)) * Math.PI);
        int Fl2 = (int) (((d2 / 2) * (d2 / 2)) * Math.PI);

        int Pizza1 = Fl1 / p1;
        int Pizza2 = Fl2 / p2;

        if (Pizza1 > Pizza2) {
            System.out.println("Pizza 1 ist günstiger");
        } else {
            System.out.println("Pizza 2 ist günstiger");
        }
    }
}