package Lektion22.Primzahl;

import java.util.*;

public class PrimzahlThread extends Thread {
    private List<Integer> ZahlenListe;
    private Map<Integer, Boolean> Ergebnis = new HashMap<Integer, Boolean>();

    public PrimzahlThread(List<Integer> ZahlenListe) {
        this.ZahlenListe = ZahlenListe;
    }

    public static void main(String[] args) {
        PrimzahlThread pt1 = new PrimzahlThread(java.util.List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        pt1.start();
        PrimzahlThread pt2 = new PrimzahlThread(java.util.List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        pt2.start();
        try {
            pt1.join();
            pt2.join();
            System.out.println(pt1);
            System.out.println(pt2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void testeObPrimzahl() {
        boolean istPrim = false;
        boolean ZahlFertig = false;
        for (int i = 0; i < ZahlenListe.size(); i++) {
            if (ZahlenListe.get(i) == 1) {
                istPrim = false;
                //ZahlFertig = true;
                //Ergebnis.put(ZahlenListe.get(i), istPrim);
            }else if (ZahlenListe.get(i) == 2) {
                istPrim = true;
                //ZahlFertig = true;
                //Ergebnis.put(ZahlenListe.get(i), istPrim);
            }else {

                for (int divisor = 2; divisor < ZahlenListe.get(i); divisor++) {
                    if (ZahlFertig == false) {
                        if (ZahlenListe.get(i) % divisor == 0) {
                            istPrim = false;
                            //Ergebnis.put(ZahlenListe.get(i), istPrim);
                            break;
                        } else {
                            istPrim = true;
                        }
                    } else {
                        divisor = 2;
                        ZahlFertig = false;
                    }
                        //Ergebnis.put(ZahlenListe.get(i), istPrim);

                }
            }
            Ergebnis.put(ZahlenListe.get(i), istPrim);
        }
    }


    @Override
    public void run() {
        testeObPrimzahl();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Boolean> entry : Ergebnis.entrySet()) {
            sb.append(entry.getKey())
                    .append(" --> ")
                    .append(entry.getValue() ? "Primzahl" : "keine Primzahl")
                    .append("\n");
        }
        return sb.toString();
    }
}