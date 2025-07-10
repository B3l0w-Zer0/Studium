package Prüfungsvorbereitung.L15;

public class Mitarbeiter {
    String nachname, vorname, id,  geburtsdatum;
    double grundgehalt, gehaltsfaktor = 1.0;


    public double getGehaltsfaktor(){
        return gehaltsfaktor;
    }

    public double berechneGehalt() {
        return grundgehalt * gehaltsfaktor;
    }

    public void setGehaltsfaktor(double gehaltsfaktor) {
        this.gehaltsfaktor = gehaltsfaktor;
    }

    public Mitarbeiter(String Nachname, String Vorname, String Identifikator, int Grundgehalt, String Geburtsdatum){
        this.nachname = Nachname;
        this.vorname = Vorname;
        this.id = Identifikator;
        this.grundgehalt = Grundgehalt;
        this.geburtsdatum = Geburtsdatum;
    }
}

