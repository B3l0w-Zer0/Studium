package Prüfungsvorbereitung.Übungsaufgaben.weitere;

public interface L15GetränkeVorrat {
    /*String Herkunft;
    String sorte;
    double prozent;
    int Flaschengröße;
    int pfand;

    public L15GetränkeVorrat(String Herkunft, String sorte, int Flaschengröße, int pfand){
        this.Herkunft = Herkunft;
        this.sorte = sorte;
        this.Flaschengröße = Flaschengröße;
        this.pfand = pfand;
    }*/

    @Override
    public abstract String toString();

    public Boolean hatAlkohol();
        //return prozent > 0.5;

    public double getprozent();

}
