package Lektion3;
import java.util.Scanner;

public class pizza02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wollen sie 26 cm, 28 cm oder 30 cm Durchmesser? Geben sie  2 der 3 mäglichen Größen an und dazu den jeweiligen individuellen Preis.");
        System.out.println("Geben sie den Durchmesser der ersten Pizza an.");
        float groessepizza1 = (scanner.nextFloat());
        System.out.println("Geben sie den Durchmesser der zweiten Pizza an.");
        float groessepizza2 = (scanner.nextFloat());
        System.out.println("Geben sie den Preis der ersten Pizza an.");
        float preispizza1 = scanner.nextFloat();
        System.out.println("Geben sie den Preis der zweiten Pizza an.");
        float preispizza2 = scanner.nextFloat();

        double flaechepizza1 = (Math.pow((groessepizza1 / 2), 2) * Math.PI);
        System.out.println("Ihre erste Pizza hat also eine Fläche von: " + flaechepizza1);

        double flaechepizza2 = (Math.pow((groessepizza2 / 2), 2) * Math.PI);
        System.out.println("Ihre erste Pizza hat also eine Fläche von: " + flaechepizza2);

        double kostenverhaeltnispizza1 = (preispizza1 / flaechepizza1);
        double kostenverhaeltnispizza2 = (preispizza2 / flaechepizza2);

        if (kostenverhaeltnispizza1 < kostenverhaeltnispizza2) {
            System.out.println("Pizza 1, mit einer Fläche von " + flaechepizza1 + " und dem Preis von " + preispizza1 + " ist günstiger, als Pizza 2.");
        } else if (kostenverhaeltnispizza2 < kostenverhaeltnispizza1) {
            System.out.println("Pizza 2, mit einer Fläche von " + flaechepizza2 + " und dem Preis von " + preispizza2 + " ist günstiger, als Pizza 1.");
        } else {
            System.out.println("Die beiden Pizzen kosten im Verhältnis genau das gleiche.");

            scanner.close();
        }
    }
}
