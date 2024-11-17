package UebungenExperimente;
import java.util.Scanner;

public class Querprodukt05Müll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Zahlvollständig = scanner.nextInt();

        String StringZahlvollständig = String.valueOf(Zahlvollständig);
        if (StringZahlvollständig.length() > 7) {
            System.out.println("Die Zahl ist leider zu lang.");
        } else {
            char erstezahl = StringZahlvollständig.charAt(0);
            int ersteZahlint = Character.getNumericValue(erstezahl);

            char zweitezahl = StringZahlvollständig.charAt(1);
            int zweiteZahlint = Character.getNumericValue(zweitezahl);

            char drittezahl = StringZahlvollständig.charAt(2);
            int dritteZahlint = Character.getNumericValue(drittezahl);

            char viertezahl = StringZahlvollständig.charAt(3);
            int vierteZahlint = Character.getNumericValue(viertezahl);

            char fünftezahl = StringZahlvollständig.charAt(4);
            int fünfteZahlint = Character.getNumericValue(fünftezahl);

            char sechstezahl = StringZahlvollständig.charAt(5);
            int sechsteZahlint = Character.getNumericValue(sechstezahl);

            char siebtezahl = StringZahlvollständig.charAt(6);
            int siebteZahlint = Character.getNumericValue(siebtezahl);

            System.out.println(ersteZahlint + zweiteZahlint + dritteZahlint + vierteZahlint + fünfteZahlint + sechsteZahlint + siebteZahlint);
        }
    }
}