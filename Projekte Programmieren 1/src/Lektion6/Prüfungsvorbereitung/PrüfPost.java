package Prüfungsvorbereitung;

public class PrüfPost {
    String text;
    String absender;
    String empfaenger;
    PrüfPost next;

    public PrüfPost(String text, String absender, String empfaenger, PrüfPost next){
        this.text = text;
        this.absender = absender;
        this.empfaenger = empfaenger;
        this.next = next;
    }
}
