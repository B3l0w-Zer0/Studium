package Prüfungsvorbereitung;

public class PrüfTimeline {
    //PrüfPost start = new PrüfPost("Frohe Weihnachten", "Alice", "Bob", null);
    PrüfPost start = null;

    public static void main(String[] args) {
        PrüfTimeline p = new PrüfTimeline();
        p.fuegePostEin(new PrüfPost("Frohe Weihnachten", "Alice", "Bob", null));
        p.fuegePostEin(new PrüfPost("Danke! Guten Rutsch ins neue Jahr!", "Bob", "Alice", null));
        p.fuegePostEin(new PrüfPost("Gutes neues Jahr!", "Alice", "Bob", null));
        p.gibAus(p.start);
    }

    public void fuegePostEin(PrüfPost neuPost) {
        if (start == null) {
            start = neuPost;
        } else {
            PrüfPost aktuell = start;
            start = neuPost;
            start.next = aktuell;

            /*while(aktuell.next != null){
                aktuell.next = aktuell;
                aktuell = aktuell.next;
            }*/
        }
    }

    public void gibAus(PrüfPost start) {
        PrüfPost aktuell2 = start;
        if(aktuell2 == null){
            System.out.println("keine Posts vorhanden");
        }else{
            PrüfPost aktuell = start;

            while (aktuell != null){
                System.out.println(aktuell.absender + "->" + aktuell.empfaenger + '\n' + aktuell.text + '\n');
                aktuell = aktuell.next;
            }
        }
    }
}
