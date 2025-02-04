package Lektion6;
import java.util.Scanner;

public class Üb02Fakultät {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fakultät von: ");
        System.out.println(fakultät(scanner.nextInt()));

        scanner.close();

    }
    public static int fakultät(int a) {
        int fakultaet = 1;
        for (int i = 1; i <= a; i++) {
            fakultaet *= i;
        }
        return fakultaet;
    }
    //größere Zahlen können genauso gut berechnet werden. Man kann eine runtime exception throwen aber ist eigentlich unnötig

}
