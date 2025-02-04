package Prüfungsvorbereitung;
import java.util.Scanner;

public class L3Üb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();
        char k = eingabe.charAt(0);

        if (k >= 'A' && k <= 'Z') {
            System.out.println("Großbuchstabe");
        }
        if ((k >= '0' && k <= '9') || (k >= 'a' && k <= 'f') || (k >= 'A' && k <= 'F')) {
            System.out.println("Hexadezimale Ziffer");
        }
        if (k == '0' || k == '1') {
            System.out.println("Binär");
        }
        if (k >= '0' && k <= '7') {
            System.out.println("Oktale Ziffer");
        }
        if (!(k >= '0' && k <= '9' || k >= 'A' && k <= 'Z' || k >= 'a' && k <= 'z')) {
            System.out.println("Unbekannt");
        }
    }
}
