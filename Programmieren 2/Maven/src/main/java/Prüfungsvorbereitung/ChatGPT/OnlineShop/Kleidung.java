package Prüfungsvorbereitung.ChatGPT.OnlineShop;

public class Kleidung extends Produkt{
    double groesse;
    String material;
    public Kleidung(String name, double preis, double groesse, String material){
        super(name, preis);
        this.groesse = groesse;
        this.material = material;
    }
}
