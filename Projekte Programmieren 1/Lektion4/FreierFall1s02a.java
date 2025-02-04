package Lektion4;
import java.util.Scanner;

public class FreierFall1s02a {
    public static void main(String[] args) {
        System.out.println("Geben sie bitte die Falldauer an.");
        double g = 9.80665;
        Scanner scanner = new Scanner(System.in);
        float t = scanner.nextFloat();
        for (float i = 1; i <= t; i++) {
            System.out.println(0.5 * g * i * i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}


/*
import java.util.Scanner;

public class FreeFall {
    public static void main(String[] args) {
        final double g = 9.80665;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Falldauer in Sekunden eingeben: ");
        int fallTime = scanner.nextInt();

        for (int t = 1; t <= fallTime; t++) {
            double distance = 0.5 * g * t * t;
            System.out.printf("Zeit: %d Sekunden: Zurückgelegte Strecke: %.6f m%n", t, distance);
            try {
                Thread.sleep(1000); // Sekündliche Ausgabe
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 */