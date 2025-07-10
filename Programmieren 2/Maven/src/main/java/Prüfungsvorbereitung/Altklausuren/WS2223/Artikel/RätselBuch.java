package Prüfungsvorbereitung.Altklausuren.WS2223.Artikel;

public class RätselBuch extends Artikel{
    public Buch eigenschaften;
    public boolean einmalSpielbar;
    public RätselBuch(String name, int preisInCents, int gewichtInGramm, boolean einmalSpielbar, int seitenAnzahl){
        super(name, preisInCents, gewichtInGramm);
        this.eigenschaften = new Buch(name, preisInCents, gewichtInGramm, seitenAnzahl);
        this.einmalSpielbar = einmalSpielbar;
    }

    public int getSeitenAnzahl(){
        return eigenschaften.getSeitenAnzahl();
    }

    public boolean istEinmalSpielbar(){
        return einmalSpielbar;
    }
}
