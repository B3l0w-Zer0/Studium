package Lektion14;

public class Adresse {
    String strasse;
    String hausnummer;
    int plz;
    String ort;

 public static void checkUppercase(String letter) {
        char c = letter.charAt(0);
        if (c < 'A' || c > 'Z') {
            throw new RuntimeException("Not an uppercase letter");
        }
    }

    public static void checkHausnummer(String number) {
        char c = number.charAt(0);
        if (c < '0' || '9' < c) {
            throw new RuntimeException("Not a number");
        }
    }

    public Adresse(String strasse, String hausnummer, int plz, String ort) {
            checkUppercase(strasse);
            checkHausnummer(hausnummer);
            this.plz = plz;
            checkUppercase(ort);
        }
    }
