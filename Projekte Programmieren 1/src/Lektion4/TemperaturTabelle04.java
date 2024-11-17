package Lektion4;

public class TemperaturTabelle04 {
    public static void main(String[] args){
        System.out.println("Fahrenheit \t\t Celsius");
        for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit ++){
            float Celsius = (5f/9)*(fahrenheit-32);
            System.out.printf(fahrenheit + "\t\t\t\t" + Celsius + "\n\n");
        }

    }
}
