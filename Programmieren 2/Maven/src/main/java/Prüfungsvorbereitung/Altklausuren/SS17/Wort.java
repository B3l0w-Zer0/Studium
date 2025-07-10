package Prüfungsvorbereitung.Altklausuren.SS17;

public final class Wort implements Comparable<Wort>{
    String wort , wortTyp, sprache;
    int laenge;

    public Wort(String wort){
        this.wort = wort;
    }

    @Override
    public int compareTo(Wort o){
        //if(this.wort.compareTo(o.wort)) return 0;else
        return this.wort.compareTo(o.wort);
    }
}
