package Lektion15;

public abstract class PersonAbstrakt {
    String fach;

    public abstract String gibTaetigkeitAus();

    public PersonAbstrakt(String fach){
        this.fach = fach;
    }
}
