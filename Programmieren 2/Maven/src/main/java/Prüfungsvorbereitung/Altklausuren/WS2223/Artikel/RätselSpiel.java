package Prüfungsvorbereitung.Altklausuren.WS2223.Artikel;

public class RätselSpiel extends Artikel{
    public boolean einmalSpielbar;
    public RätselSpiel(String name, int preisInCents, int gewichtInGramm, boolean einmalSpielbar){
        super(name, preisInCents, gewichtInGramm);
        this.einmalSpielbar = einmalSpielbar;
    }

    public boolean istEinmalSpielbar(){
        return einmalSpielbar;
    }
}
