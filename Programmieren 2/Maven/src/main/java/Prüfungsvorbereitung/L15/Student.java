package Prüfungsvorbereitung.L15;

public class Student extends PersonAbstrakt{
    public Student(String fach) {
        super(fach);
    }

    @Override
    public String gibTaetigkeitAus(){
        return "Der Student besucht das Fach " + fach;
    }
}
