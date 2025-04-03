package Lektion15.UEB3;

public class MulitpleFragen extends QuizFragen {
    String frage;
    String[]antwort;

    public MulitpleFragen(String frage, String[] antwort) {
        this.frage = frage;
        this.antwort = antwort;
    }



    @Override
    public String ausgabe(){
        StringBuilder ausgab= new StringBuilder(frage+"\n"); //String builder ist mutable
         for (int i = 0; i < antwort.length; i++) {
             ausgab.append(antwort[i]).append("\n"); //ausgabe += ist nicht effizient

             System.out.println(antwort[i]);
         }
         return ausgab.toString();
    }
}
