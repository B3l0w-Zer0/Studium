package Prüfungsvorbereitung.Übungsaufgaben.Prüf.MusikStueck;

import java.util.Comparator;

public class VergleicheMusikStueckLaenge implements Comparator<MusikStueck> {
    @Override
    public int compare(MusikStueck m1, MusikStueck m2) {
        if (m1.laenge < m2.laenge) {
            return -1;
        } else if (m1.laenge == m2.laenge) {
            return 0;
        } else{
            return 1;
        }
    }
}
