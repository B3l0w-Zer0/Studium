package UebungenExperimente;

public class Üb01RundenEXP {
    public static void main(String[] args){
        int Zahl = runden(3.5);
        System.out.println(Zahl);
    }
    public static int runden(double a) {
        String eingabe = String.valueOf(a);
        char nachKomma = eingabe.charAt(1);
        int nachKomma1 = nachKomma;
        if (nachKomma1 >= 5) {
            double b = (a + ((10 - nachKomma1) / 10));
            int c = (int) b;
            return c;
        } else if (nachKomma1 < 5) {
            double d = (a - (nachKomma1 / 10));
            int e = (int) d;
            return e;
        } else {
            int f = (int) a;
            return f;
        }
    }

}
