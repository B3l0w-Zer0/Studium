package Prüfungsvorbereitung;
import java.util.Scanner;

public class L5Üb2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib Basis ein vallah");
        double b = scanner.nextDouble();
        System.out.println("Gib Exponent ein vallah");
        int n = scanner.nextInt();
        double result = 1.0;
        if (n > 0){
            for (int i = 0; i < n; i++){
            result *= b;
            }
            System.out.println(result);
        }else if (n == 0){
        System.out.println("1");
        }
        else if (n < 0){
            for (int i = 0; i > n; i--) {
                result *= b;
            }
            System.out.println(1/ result);
        }
    }
}
