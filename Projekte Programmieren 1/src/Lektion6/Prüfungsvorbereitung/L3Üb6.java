package Prüfungsvorbereitung;
import java.util.Scanner;

import java.util.Scanner;

public class L3Üb6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jahr = scanner.nextInt();
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    System.out.println("richtig");
                } else {
                    System.out.println("falsch");
                }

            } else {
                System.out.println("korrekt");
            }


        } else {
            System.out.println("nicht durch 4 teilbar");
        }
    }
}



