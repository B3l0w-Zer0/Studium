package Lektion3;
import java.util.Scanner;

public class Modulo7b01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        float zahl = scanner.nextFloat();

        if (zahl % 7 == 0) {
            System.out.println("Die Zahl " + zahl + " ist durch 7 teilbar.");
        } else {
            System.out.println("Die Zahl " + zahl + " ist nicht durch 7 teilbar.");
        }

        scanner.close();
    }
}
//bei negativen Zahlen wird einfach wie bei positiven Zahlen überprüft
//bei Kommazahlen muss man den int zu einem float wechseln und dann auch den scanner nach einem Float auslesen lasssen. Bei normalem int kommt eine Fehlermeldung, sonst wird eine normale Antwort ausgegeben