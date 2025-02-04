package Prüfungsvorbereitung;

public class L2Üb2 {
    public static void main(String[] args){
        int p = 16;
        int q = 7;
        int x1 = (int) (-((p/2) + (Math.sqrt(((p/2) * (p/2)) - q))));
        int x2 = (int) (-((p/2) - (Math.sqrt(((p/2) * (p/2)) - q))));
        System.out.println("x1: " + x1 + " " + "x2: " + x2);
    }
}
