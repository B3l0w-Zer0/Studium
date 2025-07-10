package Prüfungsvorbereitung.ChatGPT.Bibliothek;

public class DVD extends Medium{
    public String Regisseur;
    public int Laufzeit;

    public DVD(String Regisseur, int Laufzeit, String titel){
        super(titel);
        this.Regisseur = Regisseur;
        this.Laufzeit = Laufzeit;
    }

    @Override
    public String toString(){
        return "hat die DVD: " + titel + ", mit dem Regisseur: " + Regisseur + " und der Laufzeit von : " + Laufzeit + " Minuten ausgeliehen";
    }
}
