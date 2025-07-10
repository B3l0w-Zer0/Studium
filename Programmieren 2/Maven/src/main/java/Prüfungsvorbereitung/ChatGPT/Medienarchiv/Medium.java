package Prüfungsvorbereitung.ChatGPT.Medienarchiv;

import java.time.LocalDate;

public abstract class Medium {
    String titel;
    LocalDate erstellungsdatum;

    public Medium(String titel){
        this.titel = titel;
    }
}
