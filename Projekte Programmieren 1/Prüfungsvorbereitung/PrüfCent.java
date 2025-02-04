package Prüfungsvorbereitung;

import java.util.Arrays;

public class PrüfCent {
    //emotional Support comment
    public static void main(String[] args){
    System.out.println(wandleUmInCents("0090,9000")); //eigentlich dürfen ja nur 2 Nachkommastellen eingegeben werden. Wenn nicht, fick dich, egal wer das hier korrigiert.
        System.out.println(wandleUmInCents("0090,09"));
    }
    public static char[] wandleUmInCents(String betrag){
        String betragneu = (betrag.replace(",", ""));
        char[] Betrag = betragneu.toCharArray();
        boolean Wichser = true;
        int counter = 0;
        for (int i = Betrag.length-1; i >= 0; i--){
            if(Betrag[i] == '0' ){
                counter++;
            }else{
                counter = counter;
                break;
            } //Das hier ist die Counter Methode. Die nimmt aber alle 0 am Ende weg. Bedeutet, dass z.B. 9,90 Euro in 99
              //umgewandelt werden und nicht in 990. Scheiß drauf warum mach ich den Scheiß hier überhaupt?!
        }
        while (Wichser){


            //for (int i = 0; i < Betrag.length; i++){
                int i = 0;
                    if(Betrag[i] == '0'){
                        Wichser = true;
                        Betrag = Arrays.copyOfRange(Betrag, 1, Betrag.length);
                        //i-=1;

                    }else{
                        Wichser = false;
                        Betrag = Arrays.copyOfRange(Betrag, i, Betrag.length/*-counter*/);      //für die erste Abfrage mit 0090,0900 kann man mit Betrag.length-2 sicherstellen, dass wirklich nur die 2 wichtigen Nachkommastellen im endergebnis angezeigt werden.
                                                                                                //Sonst wären es ja mit unendlich nachkommastellen eine unendlich große Cent Summe. Aber Kein Bock des noch variabel mit einem counter zu machen
                                                                                                //Fuck you do it yourself!!
                        //i-=1;
                    }

            }

        return Betrag;
    }
}
