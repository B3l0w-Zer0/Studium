package Lektion15;

import java.time.LocalDate;

public class Angestellter {
    String Nachname;
    String Vorname;
    String Identifikator;
    double Grundgehalt;
    double Gehaltsfaktor = 1.0;
    String Geburtsdatum;


    public double getGehaltsfaktor(){
        return Gehaltsfaktor;
    }

    public double berechneGehalt() {
        return Grundgehalt * Gehaltsfaktor;
    }

    public void setGehaltsfaktor(double gehaltsfaktor) {
        this.Gehaltsfaktor = gehaltsfaktor;
    }

    public Angestellter(String Nachname, String Vorname, String Identifikator, int Grundgehalt, String Geburtsdatum){
        this.Nachname = Nachname;
        this.Vorname = Vorname;
        this.Identifikator = Identifikator;
        this.Grundgehalt = Grundgehalt;
        this.Geburtsdatum = Geburtsdatum;
    }
}


