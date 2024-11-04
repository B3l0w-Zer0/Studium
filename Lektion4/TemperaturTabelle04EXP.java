package Lektion4;

public class TemperaturTabelle04EXP {
        public static void main(String[] args) {
            System.out.println("Fahrenheit\tCelsius");

            for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit++) {
                float celsius = (5f / 9) * (fahrenheit - 32);
                System.out.printf("%d\t\t\t%.2f%n", fahrenheit, celsius);

                /*
                        Verwenden Sie System.out.printf, um die Ausgabe zu formatieren:
                        %d steht für die ganzzahligen Fahrenheit-Werte.
                        %.2f steht für die Celsius-Werte mit zwei Nachkommastellen.
                        \t fügt einen Tabulator zwischen den Spalten ein.
                        */
            }
        }
    }
