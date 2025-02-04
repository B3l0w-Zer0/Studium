package Prüfungsvorbereitung;

public class PrüfFlasche {
    String name;
    String text;
    int kapazität;
    int füllstand;

    public static void main(String[] args) {
        PrüfFlasche p = new PrüfFlasche("Fabios Mutter", "ist hot", 750);
        System.out.println(p.reduziereFuellstand(600));
        System.out.println(p.füllstand);
        System.out.println(p.reduziereFuellstand(150));
        System.out.println(p.füllstand);
        p.istLeer();
    }

    public PrüfFlasche(String name, String text, int kapazität) {
        this.name = name;
        this.text = text;
        if (kapazität <= 0) {
            throw new RuntimeException("(.Y.)");
        }
        //this.kapazität = kapazität;
        //if (füllstand <= 0){
        //  throw new RuntimeException("Fuck you!");
        //} else {
        this.füllstand = kapazität;
        //}
    }

    public int reduziereFuellstand(int Menge) {
        if (Menge < 0) {
            System.out.println("Sag mal bist du komplett geistig eingeschränkt? Du kannst nichts mehr hinzufügen!");
            return 0;
        }
        int HILFE;
        if (füllstand - Menge < 0) {
            System.out.println("Sei nicht so gierig und schreib eine richtige Aufgabe du Hure!");
            HILFE = füllstand;
            füllstand = 0;
            return HILFE;
        }
        füllstand = füllstand - Menge;
        return Menge;
    }

    public void istLeer(){
        if(füllstand == 0){
            System.out.println("Ist leer");
        }
    }
}

