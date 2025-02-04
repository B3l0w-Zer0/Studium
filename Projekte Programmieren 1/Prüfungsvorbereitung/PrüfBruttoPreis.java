package Prüfungsvorbereitung;

public class PrüfBruttoPreis {
    public static void main(String[] args){
        System.out.println(berechneNettoPreis(2.14, 0.07));
    }
    public static double berechneNettoPreis(double Brutto, double MWS){
       // double netto = Brutto * (1.0 - MWS);
        double netto = Brutto /(1 + MWS);
        return netto;
    }
}

