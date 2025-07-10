package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Bibliothek;

public class Hoerbuch extends Buch{
    String sprecher;
    int spieldauer;
    public Hoerbuch(String typ, String name, String autor, String verlag, int preisInCents, String sprecher, int spieldauer) {
        super(typ = "hoer", name, autor, verlag, preisInCents);
        this.sprecher = sprecher;
        this.spieldauer = spieldauer;
    }
}
