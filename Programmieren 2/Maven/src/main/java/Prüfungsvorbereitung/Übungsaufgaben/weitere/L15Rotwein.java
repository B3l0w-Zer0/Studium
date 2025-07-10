package Prüfungsvorbereitung.Übungsaufgaben.weitere;

public class L15Rotwein implements L15GetränkeVorrat{
    String Herkunft;
    String sorte;
    double prozent;
    int Flaschengröße;
    int pfand;
    int Jahrgang;

    public L15Rotwein(String Herkunft, String sorte, double prozent, int Jahrgang, int Flaschengröße, int pfand) {
        this.Herkunft = Herkunft;
        this.sorte = sorte;
        this.Flaschengröße = Flaschengröße;
        this.pfand = pfand;
        this.prozent = prozent;
        this.Jahrgang = Jahrgang;
    }

    public int getJahrgang(){
        return Jahrgang;
    }

    @Override
    public double getprozent(){
        return prozent;
    }

    @Override
    public Boolean hatAlkohol() {
        return prozent > 0.5;
    }
    @Override
    public String toString(){
        return "Herkunft: " + Herkunft + "\n" + "Sorte: " + sorte + "\n" + "prozent: " + prozent + "\n" + "Jahrgang: " + Jahrgang + "\n" + "Flaschengröße: " + Flaschengröße + "\n" + "pfand: " + pfand;

    }


}
