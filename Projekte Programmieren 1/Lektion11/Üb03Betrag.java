package Lektion11;

public class Üb03Betrag {
    public static void main(String[] args) {
        int i = -3;
        System.out.println(Üb03Betrag(i));
    }

    public static int Üb03Betrag(int val) {
        if (val < 0) {
            val *= -1;
        }
        return val;
    }

    public static float Üb03Betrag(float val) {
        if (val < 0) {
            val *= -1;
        }
        return val;
    }

    public static double Üb03Betrag(double val) {
        if (val < 0) {
            val *= -1;
        }
        return val;
    }

    public static long Üb03Betrag(long val) {
        if (val < 0) {
            val *= -1;
        }
        return val;
    }

    public static short Üb03Betrag(short val) {
        if (val < 0) {
            val *= -1;
        }
        return val;
    }
}
