package Lektion20.MauMau;

import java.util.ArrayList;

public class MauMau {
    public static void main(String[] args){
        Spieler spieler1 = new Spieler("Fabio");
        ArrayList<Karten> stack = Stack.erstelleStack();
        spieler1.zieheKarten(stack, 6);
    }
}

