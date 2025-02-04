package Lektion6;
import java.util.Scanner;

public class Üb03Dreieck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(dreieck(scanner.nextInt()));
    }

    public static String dreieck(int x) {
        String line = "";
        String spacer = "";
        String dreieck = "";

        for (int i = 0; i < x; i++) {
            for (int j = x - 1 - i; j > 0; j--) {
                spacer += " ";
            }
            line += "* ";
            dreieck += spacer + line + "\n";
            spacer = "";
        }

        return dreieck;
    }
}
