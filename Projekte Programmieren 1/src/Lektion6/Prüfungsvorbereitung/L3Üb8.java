package Prüfungsvorbereitung;
import java.util.Scanner;

public class L3Üb8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String werte = scanner.next();

        char z1 = werte.charAt(0);
        char z2 = werte.charAt(1);

        if (z1 == 'f' && z2 == 'f') {
            System.out.println("0");
        }
        if (z1 == 'f' && z2 == 't') {
            System.out.println("1");
        }
        if (z1 == 't' && z2 == 'f') {
            System.out.println("2");
        }
        if (z1 == 't' && z2 == 't') {
            System.out.println("3");
        }
        if ((z1 != 't' && z1 != 'f') || (z2 != 't' && z2 != 'f')) {
            System.out.println("halts maul!");
        }
    }
}
