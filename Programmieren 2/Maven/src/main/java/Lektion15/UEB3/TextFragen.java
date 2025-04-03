package Lektion15.UEB3;

import Lektion15.UEB3.QuizFragen;

public class TextFragen extends QuizFragen {
    String frage;


   public TextFragen(String frage) {
       this.frage = frage;
   }


    @Override
    public String ausgabe(){
        return frage+"\n\nAntwort:\n\n";
    }

}
