package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Fahrt;

import java.util.ArrayList;
import java.util.List;

public abstract class Fahrzeug {

    public List<Fahrt> Fahrtenbuch = new ArrayList<>();
    public abstract double berechneEntgelt(Fahrt fahrt1);
    public void eintragen(Fahrt fahrt1){
        Fahrtenbuch.add(fahrt1);
    }
    public List<Fahrt> getFahrtenbuch(){
        return Fahrtenbuch;
    }
}
