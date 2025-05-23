package Lektion20.MauMau;

import java.util.ArrayList;

public class Stack {
    static ArrayList<Karten> Stack = new ArrayList<>();
    private static String[] Symbols = {"Herz", "Kreuz", "Pik", "Karo"};
    private static String[] Werte = {"7", "8", "9", "10", "Bube", "Dame", "König", "Ass"};

    public static ArrayList<Karten> erstelleStack() {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 7; j++) {
                Karten aktuell = new Karten(Symbols[i], Werte[j]);
                Stack.add(aktuell);
                //System.out.println(Symbols[i] + " - " + Werte[j]);
            }
        }

        return Stack;
    }


}
