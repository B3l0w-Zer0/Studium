package Prüfungsvorbereitung.Übungsaufgaben.Prüf.MusikStueck;

public class MusikStueck {
    String titel;
    // Name des Musikstueckes
    String interpret; // Gruppe/Saenger des Stueckes
    int laenge;
    // Dauer in Sekunden
    public MusikStueck(String titel, String interpret, int laenge)
    {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }

    public String getTitel(){
        return titel;
    }

    public String getInterpret(){
        return interpret;
    }

    public int getLaenge(){
        return laenge;
    }

    @Override
    public String toString(){
        return "titel: " + titel + "\n" + "Interpret: " + interpret + "\n"+ "Länge: " + laenge;
    }

}
