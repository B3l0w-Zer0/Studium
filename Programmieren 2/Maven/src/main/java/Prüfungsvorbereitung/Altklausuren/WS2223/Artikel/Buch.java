package Prüfungsvorbereitung.Altklausuren.WS2223.Artikel;

public class Buch extends Artikel{
    public int seitenAnzahl;
    public Buch(String name, int preisInCents, int gewichtInGramm, int seitenAnzahl){
        super(name, preisInCents, gewichtInGramm);
        this.seitenAnzahl = seitenAnzahl;
    }

    public int getSeitenAnzahl(){
        return seitenAnzahl;
    }

    public double preisProSeite(int seitenAnzahl, int preisInCents){
        return preisInCents / seitenAnzahl;
    }
}
