package Lektion5;
import java.util.Scanner;

public class Üb02Potenz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b = scanner.nextDouble();
        int n = scanner.nextInt();
        double Ergebnis = 1;

        if (n > 0) {
            for (int i = n; i > 0; i--) {
                Ergebnis = Ergebnis * b;
            }
            System.out.println(Ergebnis);
        } else if (n == 0) {

            System.out.println(Ergebnis);
        } else {

            for (int i = n; i < 0; i++) {
                Ergebnis = Ergebnis * b;
            }
            System.out.println(1 / Ergebnis);
        }
    }
}