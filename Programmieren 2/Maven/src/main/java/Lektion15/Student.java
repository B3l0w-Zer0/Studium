package Lektion15;

import Lektion15.PersonAbstrakt;

public class Student extends PersonAbstrakt {
    public Student(String fach) {
        super(fach);
    }

    @Override
    public String gibTaetigkeitAus(){
        return "Der Student besucht das Fach " + fach;
    }
}
