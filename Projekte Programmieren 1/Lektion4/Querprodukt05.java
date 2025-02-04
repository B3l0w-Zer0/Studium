package Lektion4;
import java.util.Scanner;

public class Querprodukt05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();

        if (z > 1000000 || z < 0) {
            System.out.println("Fehler - Zahl ist ungültig.");
        } else {
            int querprodukt = 1;
            while (z != 0) {
                querprodukt *= z % 10;
                z /= 10;

            }
            System.out.println(querprodukt);
        }
    }
}
