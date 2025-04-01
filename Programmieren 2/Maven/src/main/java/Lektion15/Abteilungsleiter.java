package Lektion15;

public class Abteilungsleiter extends Angestellter{
    public Abteilungsleiter(String Nachname, String Vorname, String Identifikator, int Grundgehalt, String Geburtsdatum) {
        super(Nachname, Vorname, Identifikator, Grundgehalt, Geburtsdatum);
        setGehaltsfaktor(2.0);
    }

    public void befoerdern(Angestellter angestellter) {
        angestellter.setGehaltsfaktor(angestellter.getGehaltsfaktor() * 1.1);
    }
}
