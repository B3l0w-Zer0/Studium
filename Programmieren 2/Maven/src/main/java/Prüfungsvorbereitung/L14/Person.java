package Prüfungsvorbereitung.L14;



public class Person {
    String vorname, nachname;
    Adresse adresse;

    public Person(String vorname, String nachname, Prüfungsvorbereitung.L14.Adresse adresse){
        checkUpperCase(vorname);
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }

    public void checkUpperCase(String Wort){
        char c = Wort.charAt(0);
        if(!Character.isUpperCase(c))
            throw new RuntimeException("Kein Großbuchstabe!");
        }
    }

