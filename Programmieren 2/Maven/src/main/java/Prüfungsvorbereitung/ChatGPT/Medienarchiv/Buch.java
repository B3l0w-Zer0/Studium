package Prüfungsvorbereitung.ChatGPT.Medienarchiv;

public class Buch extends Medium{
    String ISBN;

    public Buch(String titel, String ISBN){
        super(titel);
        this.ISBN = ISBN;
    }
}
