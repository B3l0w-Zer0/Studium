package Lektion21;

public class Naehrstoffangaben {
    int Portionsqroesse;
    int Anzahl_Portionen;
    float Eiweiß;
    float Fett;
    float Kohlenhydrate;
    float Natrium;

    public Naehrstoffangaben(int Portionsgroesse, int Anzahl_Portionen){
        this.Portionsqroesse = Portionsgroesse;
        this.Anzahl_Portionen = Anzahl_Portionen;
    }

    public Naehrstoffangaben withEiweiß(float Eiweiß){
        this.Eiweiß = Eiweiß;
        return this;
    }

    public Naehrstoffangaben withFett(float Fett){
        this.Fett = Fett;
        return this;
    }

    public Naehrstoffangaben withKohlenhydrate(float Kohlenhydrate){
        this.Kohlenhydrate = Kohlenhydrate;
        return this;
    }

    public Naehrstoffangaben withNatrium(float Natrium){
        this.Natrium = Natrium;
        return this;
    }
}
