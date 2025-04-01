package Lektion14Tests;

public class Person {
    String vorname;
    String nachname;
    Adresse adresse;

    public static void checkUppercase(String letter) {
        char c = letter.charAt(0);
        if (c < 'A' || c > 'Z') {
            throw new RuntimeException("Not an uppercase letter");
        }
    }

    public Person(String vorname, String nachname, Adresse adresse) {
        checkUppercase(vorname);
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;

    }
}