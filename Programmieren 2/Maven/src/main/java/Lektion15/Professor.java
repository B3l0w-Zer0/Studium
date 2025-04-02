package Lektion15;

import Lektion15.PersonAbstrakt;

public class Professor extends PersonAbstrakt{
    public Professor(String fach) {
        super(fach);
    }

    @Override
    public String gibTaetigkeitAus(){
        return "Der Professor unterrichtet " + fach;
    }
}
