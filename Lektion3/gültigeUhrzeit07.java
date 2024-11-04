package Lektion3;
import java.util.Scanner;

public class gültigeUhrzeit07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stundenzahl von 0 - 23 eingeben: ");
                int stunde = scanner.nextInt();

        System.out.println("Minutenzahl von 0 - 59 eingeben: ");
                int minute = scanner.nextInt();

        System.out.println("Sekundenzahl von 0 - 59 eingeben: ");
                int sekunde = scanner.nextInt();

        if(stunde >= 0 && stunde <= 23 && minute >= 0 && minute <= 59 && sekunde >= 0 && sekunde <= 59)
        {System.out.println(stunde + ":" + minute + ":" + sekunde + " ist eine gültige Uhrzeit.");
        }
        else
        {
            System.out.println("Bei " + stunde + ":" + minute + ":" + sekunde + " handelt es sich nicht um eine gültige Uhrzeit.");

        }
        scanner.close();
    }
}
