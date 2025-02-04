package Prüfungsvorbereitung;
import java.util.Scanner;

public class L4Üb2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int sek = scanner.nextInt();
        for (int i = 1; i <= sek; i++) {
            if (i == 1 || i % 5 == 1) {
                double strecke = (0.5 * 9.80665 * (i * i));
                System.out.println("Strecke nach: " + i + " Sekunden: " + strecke);
                Thread.sleep(1000);
            }
        }
    }
}
