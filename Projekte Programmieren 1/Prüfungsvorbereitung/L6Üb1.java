package Prüfungsvorbereitung;

public class L6Üb1 {
    public static void main(String[] args){
    System.out.println(runden2(2.5134564, 4));
    }
    public static int runden(double zahl){
        if (zahl % (int) zahl >= 0.5){
            return (int) (zahl + 1);
        }else{
            return (int) zahl;
        }

    }
    public static double runden2(double Zahl, int Stellen){
        int hilfe = 10;
        for(int i = 1; i < Stellen; i++){
            hilfe*= 10.0;
        }
        Zahl *= hilfe;
        Zahl = runden(Zahl);
        Zahl /= hilfe;

        return Zahl;
    }
}
