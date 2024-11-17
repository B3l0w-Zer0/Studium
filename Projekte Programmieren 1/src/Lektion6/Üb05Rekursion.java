package Lektion6;
import java.util.Scanner;

public class Üb05Rekursion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Basis eingeben: ");
        double basis = scanner.nextDouble();
        System.out.println("Bitte Exponent eingeben: ");
        int exponent = scanner.nextInt();
        System.out.println(potenz(basis, exponent));
    }
    public static int potenz(double basis, int exponent){
        int ergebnis = 1;
        for (int i = exponent; i > 0; i--){
            ergebnis *= basis;

        }
        return ergebnis;
    }
}
