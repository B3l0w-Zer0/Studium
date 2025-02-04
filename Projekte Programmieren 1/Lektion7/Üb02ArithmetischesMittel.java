package Lektion7;
import java.util.Scanner;

public class Üb02ArithmetischesMittel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der einzulesenden Werte eingeben: ");
        int anzahl = scanner.nextInt();
        float max = 0;
        float min = 0;
        float sum = 0;
        float mittel = 0;
        int i;
        if (anzahl < 0) System.out.println(1);
        float[] werte = new float[anzahl];
        for (i = 0; i < anzahl; i++) {
            System.out.println("Zahl für " + (1 + i) + "te Stelle eingeben: ");
            float wert = scanner.nextFloat();
            if (wert < 0) System.exit(1);
            werte[i] = wert;

            if (i >= 1) {
                if (werte[i] > werte[i - 1]) {
                    max = wert;
                }
                if (werte[i] < werte[i - 1]) {
                    min = wert;
                }
            }
             sum = sum + werte[i];

        }
        mittel = sum/i;
            System.out.println("min: " + min + " max: " + max + " sum: " + sum + " mittelwert: " + mittel);

        }
    }





  /*
        int [] zahlen = new int[5];
        System.out.println("geben sie an, wie viele 1er: ");
        int eins = scanner.nextInt();
        zahlen[0] = eins;
        System.out.println("geben sie an, wie viele 2er: ");
        int zwei = scanner.nextInt();
        zahlen[1] = zwei;
        System.out.println("geben sie an, wie viele 3er: ");
        int drei = scanner.nextInt();
        zahlen[2] = drei;
        System.out.println("geben sie an, wie viele 4er: ");
        int vier = scanner.nextInt();
        zahlen[3] = vier;
        System.out.println("geben sie an, wie viele 5er: ");
        int fünf = scanner.nextInt();
        zahlen[4] = fünf;

    private static float min(float[] arr) {
        float min = arr[0];
        if
        return min; */