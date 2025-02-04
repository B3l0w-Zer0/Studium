package Lektion3;
import java.util.Scanner;

public class Einzelzeichen03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String eingabe = scanner.nextLine(); //geht auch mit (char) System.in.read();
        char c = eingabe.charAt(0);

        if (c >= 'A'&& c <= 'Z') {
            System.out.println("Großbuchstabe");
        }

        if (c >= 'a' && c <= 'z'){
            System.out.println("Kleinbuchstabe");
        }

        if (c >= '0' && c <= '9'|| c >= 'A'&& c <= 'Z' || c >= 'a' && c <= 'z') {
            System.out.println("Hexadezimale Ziffer");
        }

        if (c == '0' || c == '1') {
            System.out.println("Binäre Ziffer");
        }

        if (c >= '0' && c <= '7') {
            System.out.println("Oktale Ziffer");
        }

        if (!(c >= '0' && c <= '9'|| c >= 'A'&& c <= 'Z' || c >= 'a' && c <= 'z')) {
            System.out.println("Unbekannt");
        }
    }
}
