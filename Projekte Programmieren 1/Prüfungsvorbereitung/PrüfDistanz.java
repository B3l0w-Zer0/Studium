package Prüfungsvorbereitung;

public class PrüfDistanz {
    String name;
    int distanz;
    PrüfDistanz next;

    public static void main(String[] args) {
        /*PrüfDistanz start = new PrüfDistanz("Würzburg", 0, null);
        PrüfDistanz Kitzingen = new PrüfDistanz("Kitzingen", 19, null);
        PrüfDistanz Neustadt = new PrüfDistanz("Neustadt", 24, null);
        start.setNext(Kitzingen);
        Kitzingen.setNext(Neustadt);
        */
        PrüfDistanz start = new PrüfDistanz("Wuerzburg", 0, new PrüfDistanz("Kitzingen", 19, new PrüfDistanz("Neustadt", 42, null)));
        System.out.println(start.next);
        System.out.println(start.next.next);
        //System.out.println(Kitzingen.getNext());
    }

    public PrüfDistanz(String name, int distanz, PrüfDistanz next) {
        this.name = name;
        this.distanz = distanz;
        this.next = next;

    }

    public void setNext(PrüfDistanz next) {
        this.next = next;
    }

    public PrüfDistanz getNext() {
        return this.next;
    }

    public String toString() {
       // while (this.next != null) {
            return this.name + " Distanz: " + this.distanz + "km";
       // }
    }


}
