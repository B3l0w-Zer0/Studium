package Prüfungsvorbereitung.Übungsaufgaben.weitere;

public class L15Bier implements L15GetränkeVorrat{
    String Herkunft;
    String sorte;
    double prozent;
    int Flaschengröße;
    int pfand;

    public L15Bier(String Herkunft, String sorte, double prozent, int Flaschengröße, int pfand) {
        this.Herkunft = Herkunft;
        this.sorte = sorte;
        this.Flaschengröße = Flaschengröße;
        this.pfand = pfand;
        this.prozent = prozent;
    }
    @Override
    public Boolean hatAlkohol() {
        return prozent > 0.5;
    }

    @Override
    public double getprozent(){
        return prozent;
    }

    @Override
    public String toString(){
        return "Herkunft: " + Herkunft + "\n" + "Sorte: " + sorte + "\n" + "prozent: " + prozent + "\n" + "Flaschengröße: " + Flaschengröße + "\n" + "pfand: " + pfand;

    }
}
