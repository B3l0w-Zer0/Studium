package Lektion6;

public class Üb01Runden {
    public static void main (String[] args){
            System.out.println(runden2(3.141592, 3));
        }

        public static int runden(double x) {
            if (x % (int) x < 0.5) {
                return (int) x;
            } else return (int) x + 1;
        }

        public static double runden2(double x, int kommaStellen) {
            int hilfsmultiplikator = 10;
            for (int i = 1; i < kommaStellen; i++) {
                hilfsmultiplikator *= 10;
            }

            x *= hilfsmultiplikator;
            x = runden(x);
            x /= hilfsmultiplikator;

            return x;
        }
    }
