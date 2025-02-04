package Prüfungsvorbereitung;
import java.util.Scanner;

public class L4Üb5 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean vallah = false;
        int querprodukt = 1;
        System.out.println("Gib eine Zahl ein");
        while (!vallah) {
            System.out.println("Bitte geben sie eine gültige Zahl ein!");
            int zahl = scanner.nextInt();
            if (zahl < 1 || zahl > 1000000) {
                System.out.println("falsche Zahl");

            } else {
                vallah = true;
                while (zahl != 0) {
                    querprodukt *= zahl % 10;
                    zahl /= 10;
                }

                System.out.println(querprodukt);
            }
        }
    }
}
