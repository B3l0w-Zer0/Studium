package Prüfungsvorbereitung;

public class L12Üb1Lotto {
    int Zahl;
    L12Üb1Lotto next;
    public static L12Üb1Lotto start = new L12Üb1Lotto(1, null);
    int p = 8;

    public static void main(String[] args){
        L12Üb1Lotto L = new L12Üb1Lotto(0, null);
        for (int i = 2; i <= 49; i++){
            L12Üb1Lotto aktuell = start;
            while(aktuell.next != null){
                aktuell = aktuell.next;
            }
            aktuell.next = new L12Üb1Lotto(i, null);

           // System.out.println(i); //Hilfe, um zu prüfen, ob es bis 49 durchgeht

        }
        L.Ziehung();
    }

    public L12Üb1Lotto(int Zahl, L12Üb1Lotto next){
        this.Zahl = Zahl;
        this.next = next;
    }

    public int Ziehung(){
        L12Üb1Lotto aktuell = start;
        int[] fuckoffZahlen = new int[7];
        for (int k = 0; k <= 6; k++) {
            int random = (int) (Math.random() * p + 1);
            for (int j = 1; j < random; j++) {
                aktuell = aktuell.next;
                if (aktuell.next == null) {
                    aktuell.next = aktuell;

                }


            }
            /*fuckoffZahlen[k] = for(int i = 0; i < k; i++) {
                if (aktuell.Zahl == fuckoffZahlen[k]) {
                    fuckoffZahlen[k] = aktuell.next.Zahl;
                } else {
                    fuckoffZahlen[k] = aktuell.Zahl;
                }
            }*/


            for (int i = 0; i < k; i++) {
                if (fuckoffZahlen[i] == aktuell.Zahl) {
                    if(fuckoffZahlen[i] == aktuell.next.Zahl){
                        fuckoffZahlen[k] = aktuell.next.next.Zahl;
                    }else{
                        fuckoffZahlen[k] = aktuell.next.Zahl;
                    }

                }else {
                    fuckoffZahlen[k] = aktuell.Zahl;

                }
            }
                System.out.println(fuckoffZahlen[k]);
                aktuell = start;
                //aktuell = aktuell.next.next;

        }
            p--;
            //System.out.println(fuckoffZahlen);
            return aktuell.Zahl;

    }
}
// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
//Ich hasse alles!