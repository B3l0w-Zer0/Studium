package Prüfungsvorbereitung.L15;

import Lektion15.Angestellter;

public class Abteilungsleiter extends Mitarbeiter{
    public Abteilungsleiter(String nachname, String vorname, String id, int grundgehalt, String geburtsdatum) {
        super(nachname, vorname, id, grundgehalt, geburtsdatum);
        setGehaltsfaktor(2.0);
    }

    public void befoerdern(Mitarbeiter mitarbeiter) {
        mitarbeiter.setGehaltsfaktor(mitarbeiter.getGehaltsfaktor() * 1.1);
    }
}
