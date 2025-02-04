package Prüfungsvorbereitung;

public class L6Üb3 {
    public static void main(String[] args){
        System.out.println(dreieck(4));
    }

    public static String dreieck(int zeilen){
        String Zeile = "";
        String result = "";
        String leer = "";

        if(zeilen < 1){
            System.out.println("Hä wie soll ein Dreieck mit dieser Zahl erstellt werden?! Bist du dumm?");
        }
        for (int i = 0; i < zeilen; i++){
            for (int j = zeilen - 1 - i; j > 0; j--) {
                leer += " ";
            }
            Zeile += "* " ;
            result += leer + Zeile + "\n";
            leer = "";
        }
        return result;
    }
}
