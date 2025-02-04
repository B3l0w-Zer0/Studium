package Lektion5;
import java.util.Scanner;

public class Üb04Wurzel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
                System.out.println("Positive Zahl eingeben, um die Wurzel berechnen zu lassen.");
            double x = scanner.nextDouble();
            if (x < 0) {
                System.out.println("Das ist keine positive Zahl!");
            }
            double y = 1;
            boolean abbruch = false;

            /*for (int i = 1; i < 1000000; i++)*/
            int n = 0;
            do {
                n++;
                y = ((x / y) + y) / 2;
                double d = (x/y)-y;
                double dP = d < 0 ? -d : d;
                abbruch = dP < 1e-10;
                if (n == 10 || n == 100 || n == 1000 || n == 10000) {
                    System.out.println(n + ": " + (Math.sqrt(x) - y));
                }

            } while (!abbruch) ;
            System.out.println(y + " in " + n + " Iterationen");
    }
}
