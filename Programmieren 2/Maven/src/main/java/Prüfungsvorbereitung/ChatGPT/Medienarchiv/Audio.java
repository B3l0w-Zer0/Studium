package Prüfungsvorbereitung.ChatGPT.Medienarchiv;

public class Audio extends Medium{
    int laufzeit;

    public Audio(String titel, int laufzeit){
        super(titel);
        this.laufzeit = laufzeit;
    }
}
