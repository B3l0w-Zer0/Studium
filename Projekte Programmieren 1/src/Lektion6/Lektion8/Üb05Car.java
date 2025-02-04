package Lektion8;

public class Üb05Car {
    public static class Auto {
        String marke;
        int hubraum;
        String farbe;
        String weitereMerkmale;

        // Konstruktor
        public Auto(String marke, int hubraum, String farbe, String weitereMerkmale) {
            this.marke = marke;
            this.hubraum = hubraum;
            this.farbe = farbe;
            this.weitereMerkmale = weitereMerkmale;
        }

        // Methode zur Ausgabe der Autodaten
        public void printDetails() {
            System.out.println("Marke: " + marke);
            System.out.println("Hubraum: " + hubraum);
            System.out.println("Farbe: " + farbe);
            System.out.println("Weitere Merkmale: " + weitereMerkmale);
        }
    }


        public static void main(String[] args) {
            if (args.length < 12) {
                System.out.println("Bitte geben Sie die Attribute für drei Autos an: Marke, Hubraum, Farbe und weitere Merkmale.");
                return;
            }

            // Erstellen der drei Lieblingsautos
            Auto[] autos = new Auto[3];
            autos[0] = new Auto(args[0], Integer.parseInt(args[1]), args[2], args[3]);
            autos[1] = new Auto(args[4], Integer.parseInt(args[5]), args[6], args[7]);
            autos[2] = new Auto(args[8], Integer.parseInt(args[9]), args[10], args[11]);

            // Ermitteln des Autos mit dem größten Hubraum
            Auto groessterHubraumAuto = autos[0];
            for (int i = 1; i < autos.length; i++) {
                if (autos[i].hubraum > groessterHubraumAuto.hubraum) {
                    groessterHubraumAuto = autos[i];
                }
            }

            // Ausgabe der Daten des Autos mit dem größten Hubraum
            System.out.println("Auto mit dem größten Hubraum:");
            groessterHubraumAuto.printDetails();
        }
    }
