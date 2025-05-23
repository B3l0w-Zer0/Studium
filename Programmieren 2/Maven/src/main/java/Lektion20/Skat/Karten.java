package Lektion20.Skat;

import java.util.*;

public class Karten implements Comparable<Karten> {
    private String Symbol;
    private String Wert;

    private static final List<String> Symbole_Reihenfolge = Arrays.asList("Kreuz", "Pik", "Herz", "Karo");
    private static final List<String> Werte_Reihenfolge = Arrays.asList("Bube", "Ass", "10", "König", "Dame", "9", "8", "7");

    public Karten(String symbol, String wert) {
        this.Symbol = symbol;
        this.Wert = wert;
    }

    public String getSymbol() {
        return Symbol;
    }

    public String getWert() {
        return Wert;
    }

    @Override
    public int compareTo(Karten andereKarte) {
        int farbenVergleich = Integer.compare(Symbole_Reihenfolge.indexOf(this.Symbol), Symbole_Reihenfolge.indexOf(andereKarte.Symbol));
        if (farbenVergleich != 0) {
            return farbenVergleich;
        }
        return Integer.compare(Werte_Reihenfolge.indexOf(this.Wert), Werte_Reihenfolge.indexOf(andereKarte.Wert));
    }
}
