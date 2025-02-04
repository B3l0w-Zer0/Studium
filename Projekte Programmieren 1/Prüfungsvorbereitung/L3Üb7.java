package Prüfungsvorbereitung;
import java.util.Scanner;

public class L3Üb7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stunde:");
        int h = scanner.nextInt();
        System.out.println("Minute:");
        int m = scanner.nextInt();
        System.out.println("Sekunde:");
        int s = scanner.nextInt();

        if ((h < 0 || h > 23) || (m < 0 || m > 59) || (s < 0 || s > 59)) {
            System.err.println("Invalid time provided");
        } else {
            if (h <= 9 && h >= 0 || m <= 9 && m >= 0 || s <= 9 && s >= 0) {
                System.out.println("eine gute Uhrzeit meister! 0" + h + ":0" + m + ":0" + s);
            } else {
                System.out.println("eine gute Uhrzeit meister! " + h + ":" + m + ":" + s);
            }
        }
    }
}