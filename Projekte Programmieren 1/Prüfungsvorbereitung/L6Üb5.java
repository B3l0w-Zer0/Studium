package Prüfungsvorbereitung;
import java.util.Scanner;

public class L6Üb5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib Basis ein vallah");
        double b = scanner.nextDouble();
        System.out.println("Gib Exponent ein vallah");
        int n = scanner.nextInt();
        System.out.println(Potenz(b, n));

    }
    public static double Potenz(double b, int n){
        double result = 1.0;
        if (n > 0){
            for (int i = 0; i < n; i++){
                result *= b;
            }
        }else if (n == 0){
            result = 1;
        }
        else if (n < 0){
            for (int i = 0; i > n; i--) {
                result *= b;
            }
            result = 1/ result;
        }
        return  result;
    }
}
