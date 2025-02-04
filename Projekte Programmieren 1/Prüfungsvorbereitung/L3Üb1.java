package Prüfungsvorbereitung;
import java.util.Scanner;

public class L3Üb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Vallah = false;
        while (Vallah == false){

            System.out.println("EEY Puppe gib ma Nummer");
            int Zahl = scanner.nextInt();

            if (Zahl % 7 == 0) {
                System.out.println("Danke Zuckerschnute");
                Vallah = true;
            } else {
                System.out.println("Fotze warst eh hässlich");
                Vallah = false;
            }
        }
    }
}