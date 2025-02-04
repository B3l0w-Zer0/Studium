package Prüfungsvorbereitung;

public class PrüfPolynom {
        private double a, b, c, d;

        // Konstruktor
        public PrüfPolynom(double a, double b, double c, double d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        // Methode zur Berechnung des Polynoms an der Stelle x
        public double berechneAnDerStelleX(double x) {
            return a * (x * x * x) + b * (x * x) + c * x + d;
        }

        // Methode zur Berechnung der ersten Ableitung des Polynoms
        public PrüfPolynom leiteAb() {
            double newA = 3 * a;
            double newB = 2 * b;
            double newC = c;
            double newD = 0; // Konstante fällt weg
            System.out.println("Erste Ableitung: " + newA + "x^2 +" + newB + "x + " + newC);
            return new PrüfPolynom(newA, newB, newC, newD);

        }

        // Überschreiben der toString-Methode
        @Override
        public String toString() {
            return a + "x^3 + " + b + "x^2 + " + c + "x + " + d;
        }

        // main-Methode zum Testen der Klasse
        public static void main(String[] args) {
            // Erstellen des Polynoms 1.5x^3 + 4.0x^2 + 1.3x - 8.0
            PrüfPolynom polynom = new PrüfPolynom(1.5, 4.0, 1.3, -8.0);

            // Berechnung des Polynoms an der Stelle x = 2
            double wertAnDerStelle2 = polynom.berechneAnDerStelleX(2);
            System.out.println("Wert an der Stelle x=2: " + wertAnDerStelle2);

            // Berechnung der ersten Ableitung des Polynoms
            PrüfPolynom ableitung = polynom.leiteAb();
            //System.out.println("Erste Ableitung: " +);

            // Ausgabe des Polynoms
            System.out.println("Polynom: " + polynom);
        }
    }
