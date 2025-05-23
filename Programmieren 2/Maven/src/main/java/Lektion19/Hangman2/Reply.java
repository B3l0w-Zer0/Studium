package Lektion19.Hangman2;

import java.io.Serializable;

public class Reply implements Serializable {
    public String anzeige;
    public boolean treffer;
    public boolean wortErraten;
    public boolean spielBeendet;
    public int verbleibendeVersuche;

    public Reply(String anzeige, boolean treffer, boolean wortErraten, boolean spielBeendet, int verbleibendeVersuche) {
        this.anzeige = anzeige;
        this.treffer = treffer;
        this.wortErraten = wortErraten;
        this.spielBeendet = spielBeendet;
        this.verbleibendeVersuche = verbleibendeVersuche;
    }
}