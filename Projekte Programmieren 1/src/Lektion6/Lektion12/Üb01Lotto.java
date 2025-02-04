package Lektion12;

public class Üb01Lotto {
    public static void main(String[] args){
        int LosTopf = 49;
        int AnzahlZiehungen = 6;
        EinfacheListe lottozahlen = new EinfacheListe();

        for (int i = 1; i < LosTopf; i++){
            lottozahlen.addZahl(lottozahlen, i);
        }

        for (int i = 0; i < AnzahlZiehungen; i++){
            Zahl zahl = lottozahlen.head;
            Zahl prev = lottozahlen.head;

            int offset = (int) (Math.random() * LosTopf);

            while (offset != 0) {
                prev = zahl;
                zahl = zahl.getNext();
                offset--;
            }

            prev.setNext(zahl.getNext());
            LosTopf = LosTopf - 1;
            System.out.println(zahl.getValue());
        }

    }
}
