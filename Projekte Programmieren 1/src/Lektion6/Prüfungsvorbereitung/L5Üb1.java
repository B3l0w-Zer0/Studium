package Prüfungsvorbereitung;

public class L5Üb1 {
    public static void main(String[] args){
        double summe = 0;
        double previousnum;
        int k = 1;
        do{
            previousnum = summe;
            summe += 1.0/ (k * k);
            k++;
            System.out.println(summe);
        }
        while(summe - previousnum > 0.00001);

        System.out.println(6*summe);
    }
}
