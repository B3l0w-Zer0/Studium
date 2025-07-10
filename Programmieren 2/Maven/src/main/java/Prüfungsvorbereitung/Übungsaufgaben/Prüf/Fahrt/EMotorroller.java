package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Fahrt;

public class EMotorroller extends Fahrzeug implements EFahrzeug{
    @Override
    public void kehreZurückZurLadestation(){

    }

    @Override
    public double berechneEntgelt(Fahrt fahrt1){
        return 3 + 0.15*fahrt1.min;
    }
}
