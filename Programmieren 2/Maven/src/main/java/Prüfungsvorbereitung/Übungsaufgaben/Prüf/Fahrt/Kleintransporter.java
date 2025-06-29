package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Fahrt;

public class Kleintransporter extends Fahrzeug{
    public double berechneEntgelt(Fahrt fahrt1){
        if(fahrt1.min <= 60){
            return 0.30*fahrt1.km;
        }else{
            return 0.25*(fahrt1.min-60)+0.30 * fahrt1.km;
        }
    }
}
