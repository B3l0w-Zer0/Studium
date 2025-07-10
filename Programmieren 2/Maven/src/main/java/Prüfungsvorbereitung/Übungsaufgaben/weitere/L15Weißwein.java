package Prüfungsvorbereitung.Übungsaufgaben.weitere;

public class L15Weißwein implements L15GetränkeVorrat, Pfand{
    String Herkunft;
    String sorte;
    double prozent;
    int Flaschengröße;
    int pfand;
    int Jahrgang;

    public L15Weißwein(String Herkunft, String sorte, double prozent, int Jahrgang, int Flaschengröße, int pfand) {
       this.Herkunft = Herkunft;
       this.sorte = sorte;
       this.Flaschengröße = Flaschengröße;
       this.pfand = pfand;
       this.prozent = prozent;
       this.Jahrgang = Jahrgang;
    }

    @Override
    public int flaschenpfand(){
        if (pfand < 0){
            return Math.abs(pfand); //weil fabio das auch will mimimimi *(-1) wie viel ist dein auto wert? Ralf Schumacher??!?!?!?!?!?!
        } else {
            return pfand;
        }
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

    //emotional support Ralf Schumacher
}

