package Prüfungsvorbereitung.L14;

public class Adresse {
    String strasse;
    String hausnummer;
    int postleitzahl;
    String ort;

    public Adresse(String strasse, String hausnummer, int postleitzahl, String ort){
        checkUpperCase(strasse);
        this.strasse = strasse;
        checkNumber(hausnummer);
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        checkUpperCase(ort);
        this.ort = ort;


    }

    public void checkUpperCase(String Wort){
        char c = Wort.charAt(0);
        if(!Character.isUpperCase(c))
            throw new RuntimeException("Kein Großbuchstabe!");
    }

    public void checkNumber(String Number){
        char i = Number.charAt(0);
        if (i < '0' || i > '9')
                throw new RuntimeException("Keine Nummer!");
    }
}
