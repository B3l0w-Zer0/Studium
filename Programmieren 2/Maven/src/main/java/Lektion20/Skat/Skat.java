package Lektion20.Skat;

import java.util.*;

public class Skat {
    public static void main(String[] args) {
        List<Karten> hand = new ArrayList<>();
        hand.add(new Karten("Kreuz", "Ass"));
        hand.add(new Karten("Herz", "10"));
        hand.add(new Karten("Karo", "Bube"));
        hand.add(new Karten("Pik", "König"));
        hand.add(new Karten("Kreuz", "Bube"));
        hand.add(new Karten("Herz", "Dame"));
        hand.add(new Karten("Karo", "7"));
        hand.add(new Karten("Pik", "Ass"));
        hand.add(new Karten("Kreuz", "10"));
        hand.add(new Karten("Herz", "9"));

        Collections.sort(hand);

        for (Karten k : hand) {
            System.out.println(k.getSymbol() + " - " + k.getWert());
        }
    }
}
