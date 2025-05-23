package Lektion20.MauMau;

public class Karten {
    public String Symbol;
    public String Wert;

    public Karten(String Symbol, String Wert){
        this.Symbol = Symbol;
        this.Wert = Wert;
    }
    public String getSymbol(){
        return Symbol;
    }

    public String getWert(){
        return Wert;
    }
}
