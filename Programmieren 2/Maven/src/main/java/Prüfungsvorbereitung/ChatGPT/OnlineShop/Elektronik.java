package Prüfungsvorbereitung.ChatGPT.OnlineShop;

public class Elektronik extends Produkt{
    int garantie;

    public Elektronik(String name, double preis, int garantie){
        super(name, preis);
        this.garantie = garantie;
    }
}
