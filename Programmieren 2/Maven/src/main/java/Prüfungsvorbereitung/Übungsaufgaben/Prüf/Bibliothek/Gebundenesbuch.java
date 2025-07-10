package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Bibliothek;

public class Gebundenesbuch extends Buch{
    int seitenzahl;
    public Gebundenesbuch(String typ, String name, String autor, String verlag, int preisInCents, int seitenzahl) {
        super(typ = "gebunden", name, autor, verlag, preisInCents);
        this.seitenzahl = seitenzahl;
    }
}
