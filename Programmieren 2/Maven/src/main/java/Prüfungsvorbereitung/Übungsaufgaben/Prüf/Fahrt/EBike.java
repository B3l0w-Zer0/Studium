package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Fahrt;

public class EBike extends Fahrzeug implements EFahrzeug{
    @Override
    public void kehreZurückZurLadestation(){

    }

    @Override
    public double berechneEntgelt(Fahrt fahrt1){
        return 0.125*fahrt1.min;
    }
}
