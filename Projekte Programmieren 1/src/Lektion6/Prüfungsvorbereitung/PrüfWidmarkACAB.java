package Prüfungsvorbereitung;

public class PrüfWidmarkACAB {
    //Emotional Support Comment
    //Exmatrikuliere mich bitte!!! AAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHHHHH
    public static void main(String[] args) {
        System.out.println("Ein Bier");
        System.out.println("Die Masse ihres Getränkes beträgt: " + berechneMasse(1000, 0.05));
        System.out.println("ihre Promillezahl beträgt: " + berechneAlkKonzentration ((berechneMasse(1000, 0.05)), 'm', 70));
        double Promille =(berechneAlkKonzentration ((berechneMasse(1000, 0.05)), 'm', 70));
        if(Promille >= 0.5){
            System.err.println("Sie dürfen kein Auto mehr fahren!!!");
        }
        else if(Promille < 0.5 && Promille >= 0.3){
            System.out.println("Sie sollten kein Auto mehr fahren");
        }
        else{
            System.out.println("Yallah Abfahrt!");
        }
    }

    public static double berechneMasse(double V, double e) {
        float p = 0.8F;

        double A = V * e * p;

        return A;
    }

    public static double berechneAlkKonzentration(double A, char g, double m) {
        double w;

        if (g == 'm') {
            w = A / (m * 0.7);
            ;
        } else if (g == 'w') {
            w = A / (m * 0.6);
            ;
        } else if (g == 'j') {
            w = A / (m * 0.5);
            ;
        } else {
            System.err.println("WER BIST DU?!");
            return -1;
        }
        return w;
    }
}

