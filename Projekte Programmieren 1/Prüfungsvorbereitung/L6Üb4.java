package Prüfungsvorbereitung;
import java.util.Scanner;

public class L6Üb4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein.");

        System.out.println(prim(scanner.nextInt()));
    }

    public static boolean prim(int zahl){
        boolean prim = false;
        int zähler = 0;

        if (zahl <= 1) {
            prim = false;
        }
        for (int i = 1; i <= zahl; i++) {
            if (zahl % i == 0) {
                zähler++;
                }

        }

        if (zähler == 2) {
            prim = true;
        } else {
            prim = false;
        }
        return prim;
    }
}

