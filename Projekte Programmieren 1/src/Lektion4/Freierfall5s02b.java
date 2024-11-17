package Lektion4;
import java.util.Scanner;

public class Freierfall5s02b {
    public static void main(String[] args) {
        System.out.println("Geben sie bitte die Falldauer an:");
        Scanner scanner = new Scanner(System.in);
        double g = 9.80665;
        float t = scanner.nextFloat();
        for (float i = 1; i <= t; i++) {
            if (i % 5 == 1) {
                double strecke = 0.5 * g * i * i;
                System.out.println("Zeit: " + i + ", Zurückgelegte Strecke: " + strecke);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

        }
    }
}