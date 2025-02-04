package Prüfungsvorbereitung;

public class L4Üb4 {
    public static void main(String[] args){
        System.out.println("Fahrenheit \t Celsius");
        for (int i = 0; i <= 300; i++){
            float celsius = ((5f/9) * (i -32));
            System.out.println(i + "\t\t\t\t" + celsius );
        }
    }
}
