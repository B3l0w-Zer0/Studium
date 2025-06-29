package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Fahrt;

import java.util.List;

public class Umsatzberechner {

    public double berechneUmsatz(List<Fahrzeug> List){
        double Umsatz = 0.0;
        for(Fahrzeug fahrzeug : List){
            for(Fahrt fahrt1 : fahrzeug.getFahrtenbuch()){
                Umsatz += fahrzeug.berechneEntgelt(fahrt1);
            }

        }
        return Umsatz;
    }
}
