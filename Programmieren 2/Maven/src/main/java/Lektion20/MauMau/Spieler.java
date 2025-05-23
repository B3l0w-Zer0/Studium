package Lektion20.MauMau;
import Lektion16.Stack.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Spieler {
    String name;
    ArrayList<Karten> hand;
    ArrayList<Karten> stack;

    public Spieler(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }
    public void zieheKarten(ArrayList<Karten> stack, int Anzahl){
        Collections.shuffle(stack);
        for (int k = 0; k < Anzahl; k++){
            Karten aktuell = stack.remove(stack.size()-1);
            hand.add(aktuell);
            System.out.println(aktuell.getSymbol() + " - " + aktuell.getWert());
        }
    }
}
