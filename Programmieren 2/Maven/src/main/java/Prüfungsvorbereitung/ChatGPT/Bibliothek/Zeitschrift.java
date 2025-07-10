package Prüfungsvorbereitung.ChatGPT.Bibliothek;

public class Zeitschrift extends Medium{
    public String Ausgabenummer;
    public String erscheinungsdatum;

    public Zeitschrift(String Ausgabenummer, String erscheinungsdatum, String titel){
        super(titel);
        this.Ausgabenummer = Ausgabenummer;
        this.erscheinungsdatum = erscheinungsdatum;
    }

    @Override
    public String toString(){
        return "hat die Zeitschrift: " + titel + ", mit der Ausgabenummer: " + Ausgabenummer + " und dem Erscheinungsdatum: " + erscheinungsdatum + " ausgeliehen";
    }
}
