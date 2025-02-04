package Lektion11;
import java.util.Scanner;

public class Üb05TageImMonat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                System.out.print("Please input a valid month: ");
                System.out.println(tageImMonat(scanner.nextLine()));
                break;
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
        }
        scanner.close();
    }
    public static int tageImMonat(String monat){
        int tage = switch(monat)
        {
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Juli", "August", "Oktober", "Dezember" -> 31;
            default -> throw new RuntimeException("falscher Monatsname");
        };
        return tage;
    }
}
