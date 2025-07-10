package Prüfungsvorbereitung.Altklausuren.WS2223.Artikel;

import java.util.ArrayList;
import java.util.List;

public class ArtikelFilter {
    public static List<Artikel> filterEinmalSpielbar(List<Artikel> artikel) {
        List<Artikel> gefiltert = new ArrayList<Artikel>();
        for (Artikel artikel1 : artikel) {
            if ((artikel1 instanceof RätselSpiel && ((RätselSpiel) artikel1).istEinmalSpielbar()) || (artikel1 instanceof RätselBuch && ((RätselBuch) artikel1).istEinmalSpielbar())) {
                gefiltert.add(artikel1);
            }
        }
        return gefiltert;
    }
}
