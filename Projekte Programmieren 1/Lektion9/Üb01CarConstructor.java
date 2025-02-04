package Lektion9;
import java.util.Scanner;

public class Üb01CarConstructor {
    private static int anzahlautos;
    String brand;
    String model;
    String color;
    double cubicCapacity;

        public Üb01CarConstructor(String br, String mod, String col, double cubicC)
    {
        brand = br;
        model = mod;
        color = col;                    //these require this.(name) for when variable names are equal
        if(cubicC > 0){
            cubicCapacity = cubicC;
        }else{cubicCapacity = 1600;}
        anzahlautos++;
    }


    public void setCubicCapacity(double cubicC) {
        if(cubicC > 0){
            this.cubicCapacity = cubicC;
        }
    }

    public static int getAnzahlautos() {
        return anzahlautos;
    }

    public double getCubicCapacity() {
        return cubicCapacity;
    }

    //emotional support laziness

}



