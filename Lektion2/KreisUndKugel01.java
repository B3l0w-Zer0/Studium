package Lektion2;

public class KreisUndKugel01 {
    public static void main(String[] args){
        double pi = Math.PI;
        int Radius = 5;
        //Fläche
        double Fläche = ((Radius * Radius)*pi);
        System.out.println("Das hier ist die Fläche des Kreises für" + " " + Radius + " " + "Längeneinheiten: " + Fläche + " FE");

        //Kreisradius
        double Kreisradius = (2*Radius*pi);
        System.out.println("Und das hier ist der Kreisradius" + " " + Radius + " " + "Längeneinheiten: " + Kreisradius + " LE");

        //Volumen
        double Volumen = ((4/3)*pi*(Radius * Radius * Radius));
        System.out.println("Und das hier ist das Volumen der Kugel" + " " + Radius + " " + "Längeneinheiten: " + Volumen + " VE");
    }
}
