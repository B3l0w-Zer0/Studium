package UebungenExperimente;
import java.util.Scanner;

public class PizzaFalschExperiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die Größe ihrer gewünschten Pizza an. Wollen sie 26 cm, 28 cm oder 30 cm Durchmesser?");
        double groesse = scanner.nextInt();
        double preiskleinepizza = 10.99;
        double preismittelpizza = 12.99;
        double preisgrossepizza = 14.99;

        if (groesse == 26) {
            double kleinepizzaflaeche = (double) (Math.pow((26 / 2), 2) * Math.PI);
            System.out.println("Ihre Pizza hat eine Fläche von " + kleinepizzaflaeche + "cm² und kostet " + preiskleinepizza + ".");
        } else if (groesse == 28) {
            double mittelpizzaflaeche = (double) (Math.pow((28 / 2), 2) * Math.PI);
            System.out.println("Ihre Pizza hat eine Fläche von " + mittelpizzaflaeche + "cm² und kostet " + preismittelpizza + ".");
        } else if (groesse == 30) {
            double grossepizzaflaeche = (double) (Math.pow((30 / 2), 2) * Math.PI);
            System.out.println("Ihre Pizza hat eine Fläche von " + grossepizzaflaeche + "cm² und kostet " + preisgrossepizza + ".");
        } else {
            System.out.println("Es tut mir leid, diese Größe bieten wir hier nicht an.");
        }
        scanner.close();
    }
}
