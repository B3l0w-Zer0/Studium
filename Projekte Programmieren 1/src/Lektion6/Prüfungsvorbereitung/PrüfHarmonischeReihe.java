package Prüfungsvorbereitung;

public class PrüfHarmonischeReihe {
    public static void main(String[] args){
        double result = 0;
        for (int k = 1; k <= 10000; k++){
            double zaehler = 1.0;
            for (int helperK = 0; helperK <= k; helperK++){
                zaehler = zaehler * (-1);
            }
            System.out.println("einzelnes Ergebnis: " + (zaehler / k));
            result = result + ((zaehler*(-1))/k);

        }
        System.out.println(result);
    }
}
