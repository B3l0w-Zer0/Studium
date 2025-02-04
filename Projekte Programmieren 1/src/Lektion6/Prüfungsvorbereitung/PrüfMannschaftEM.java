package Prüfungsvorbereitung;

public class PrüfMannschaftEM {
    String name;
    int geschossen;
    int gegenTore;

    public PrüfMannschaftEM(String name){
        this.name = name;
        this.geschossen = 0;
        this.gegenTore = 0;
    }

    public void setTore(int tore) {
        geschossen = geschossen + tore;
    }

    public void setgegenTore(int gegen){
        gegenTore = gegenTore + gegen;
    }


}