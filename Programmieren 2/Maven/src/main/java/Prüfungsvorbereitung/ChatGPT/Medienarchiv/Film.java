package Prüfungsvorbereitung.ChatGPT.Medienarchiv;

public class Film extends Medium{
    String Regisseur;

    public Film(String titel, String Regisseur){
        super(titel);
        this.Regisseur = Regisseur;
    }
}
