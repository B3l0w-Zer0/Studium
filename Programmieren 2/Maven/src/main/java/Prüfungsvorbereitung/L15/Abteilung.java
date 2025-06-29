package Prüfungsvorbereitung.L15;

import java.util.List;

public class Abteilung {
    String name;
    Abteilungsleiter leiter;
    List<Mitarbeiter> arbeiter;

    public Abteilung(String name, Abteilungsleiter leiter, List<Mitarbeiter> arbeiter){
        this.name = name;
        this.leiter = leiter;
        this.arbeiter = arbeiter;
    }
}
