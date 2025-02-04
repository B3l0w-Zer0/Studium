package Lektion10;

public class Studenten {
    public String name;
    public String MatriNmbr;
    public int anzahlStudenten = 0;

    public Studenten(String name, String MatriNmbr){
        this.name = name;
        this.MatriNmbr = MatriNmbr;
    }
    public void betreteRaum() {

        anzahlStudenten++;
    }
    public void verlasseRaum(){
        anzahlStudenten--;
    }
}