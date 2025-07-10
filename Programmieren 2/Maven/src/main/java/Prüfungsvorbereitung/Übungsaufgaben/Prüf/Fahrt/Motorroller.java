package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Fahrt;

public class Motorroller extends Fahrzeug {

    @Override
    public double berechneEntgelt(Fahrt fahrt1){
        return 3 + 0.15*fahrt1.min;
    }
}
