package Lektion7;
import java.util.Scanner;

public class Üb01Sinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte den Wert x eingeben.");
        int x = scanner.nextInt();
        scanner.close();
        System.out.println(sin(x));
    }

    private static double sin(double x) {
        double zaehler = x;
        double nenner = 1.0;
        double summe = x;
        double summand = 1;
        for (int i = 3; summand > 1E-5 || summand < -1E-5; i += 2) {
            zaehler = zaehler * x * x * (-1);
            nenner = nenner * i * (i - 1);
            summand = zaehler / nenner;
            summe += summand;
        }
        return summe;


        }
    }