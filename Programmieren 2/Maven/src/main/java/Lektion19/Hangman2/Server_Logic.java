package Lektion19.Hangman2;

import Lektion19.Hangman2.Client_Logic;

public class Server_Logic {
    private String wort;
    private String erraten = "";
    private int versuche = 20;

    public Server_Logic(String wort) {
        this.wort = wort.toUpperCase();
    }

    public Reply verarbeite(Client_Logic input) {
        char b = input.getBuchstabe();
        boolean treffer = wort.indexOf(b) != -1;

        if (treffer && erraten.indexOf(b) == -1) {
            erraten += b;
        } else if (!treffer) {
            versuche--;
        }

        StringBuilder anzeige = new StringBuilder();
        char[] buchstaben = wort.toCharArray();
        for (int i = 0; i < buchstaben.length; i++) {
            char c = buchstaben[i];

            if (erraten.indexOf(c) != -1) {
                anzeige.append(c);
            } else {
                anzeige.append('_');
            }
        }


        boolean wortErraten = !anzeige.toString().contains("_");
        boolean beendet = wortErraten || versuche <= 0;

        return new Reply(anzeige.toString(), treffer, wortErraten, beendet, versuche);
    }
}

