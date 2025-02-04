package Prüfungsvorbereitung;

public class L2Üb1 {
    public static void main(String[] args){
        int r = 20;

        int Fläche = (int) (Math.PI * (r * r));
        System.out.println("F: " + Fläche);

        int Umfang = (int) (Math.PI * r * 2);
        System.out.println("U: " + Umfang);

        int Volumen = (int) (Math.PI * r * r * r * (4/3));
        System.out.println("V: " + Volumen);

    }
}
