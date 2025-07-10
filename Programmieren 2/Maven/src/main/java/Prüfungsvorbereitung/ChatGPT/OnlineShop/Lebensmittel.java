package Prüfungsvorbereitung.ChatGPT.OnlineShop;

public class Lebensmittel extends Produkt{
    int mhd;

    public Lebensmittel(String name, double preis, int mhd){
        super(name, preis);
        this.mhd = mhd;
    }
}
