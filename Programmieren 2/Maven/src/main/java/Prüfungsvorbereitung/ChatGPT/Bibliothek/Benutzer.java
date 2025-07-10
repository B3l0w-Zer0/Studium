package Prüfungsvorbereitung.ChatGPT.Bibliothek;

public class Benutzer extends Verleihsystem{
    String name;
    String ID;
    //Verleihsystem v1 = new Verleihsystem();
    /*Buch buchtest = new Buch("test", "test", "test");
    DVD dvdtest;
    Zeitschrift zeittest;
     */

    public Benutzer(String name, String ID){
        this.name = name;
        this.ID = ID;

    }

    public static void main(String[] args){
        Benutzer b1 = new Benutzer("Maggus Ruehl", "mussnetschmegge");
        //String ben1 = b1.toString();
        Buch buch1 = new Buch("Bob Tschigerillo", "musswirge", "2000kg");
        //String buchString = buch1.toString();
        b1.ausleihen(buch1);
        System.out.println(b1 + "" + buch1);

        Benutzer b2 = new Benutzer("Maggus Ruehl2", "mussnetschmegge2");
        //String ben1 = b1.toString();
        Buch buch2 = new Buch("Bob Tschigerillo2", "musswirge2", "2000kg2");
        //String buchString = buch1.toString();
        b2.ausleihen(buch2);
        Buch buch3 = new Buch("Bob Tschigerillo3", "musswirge3", "2000kg3");
        //String buchString = buch1.toString();
        b2.ausleihen(buch3);

        System.out.println( b2 + "" + b2.alleAusgeliehenenMedien());

        b2.rueckgabe(buch2);
        System.out.println(b2 + "" + b2.alleAusgeliehenenMedien());
    }

    @Override
    public String toString(){
        return "Der Benutzer: " + name + " mit der ID: " + ID;
    }

}
