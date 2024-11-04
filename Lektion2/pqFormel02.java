package Lektion2;

public class pqFormel02 {
    public static void main(String[] args) {
        /* Das ist nur eine Übung gewesen um zu testen, ob Wurzel so funktioniert Hahaha
        double Hallo = 4;
        double Halli = Math.sqrt(Hallo);
        System.out.println(Halli);

         */
        double q = 1;
        double p = 2;


        double xEins = (-(p/2)+Math.sqrt(((p/2) * (p/2))-q));
        double xZwei = (-(p/2)-Math.sqrt(((p/2) * (p/2))-q));
        System.out.println("x Eins:" + xEins + ", x Zwei:  " + xZwei);

    }
}