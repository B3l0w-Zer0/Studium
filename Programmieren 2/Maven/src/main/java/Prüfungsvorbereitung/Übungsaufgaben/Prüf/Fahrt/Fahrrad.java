package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Fahrt;

public class Fahrrad extends Fahrzeug {

    @Override
    public double berechneEntgelt(Fahrt fahrt1){
        return 0.125*fahrt1.min;
    }
}
