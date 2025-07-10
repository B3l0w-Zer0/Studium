package Prüfungsvorbereitung.ChatGPT.OnlineShop;

public abstract class Produkt {
    String name;
    double preis;

    public Produkt(String name, double preis){
        this.name = name;
        this.preis = preis;
    }
}
