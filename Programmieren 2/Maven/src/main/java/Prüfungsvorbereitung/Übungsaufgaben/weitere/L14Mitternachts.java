package Prüfungsvorbereitung.Übungsaufgaben.weitere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L14Mitternachts {
    public double a;
    public double b;
    public double c;

    public L14Mitternachts(double a, double b, double c){
        if(a == 0) {
            throw new IllegalArgumentException("fick dich");
        } else{
        this.a = a;
        this.b = b;
        this.c = c;
        }

    }

    public double[] roots(){
        double diskriminante = Math.pow(b, 2) - 4*a*c;
        if(diskriminante > 0) {
            double x1 = (-b + Math.sqrt(diskriminante))/(2*a);
            double x2 = (-b - Math.sqrt(diskriminante))/(2*a);
            return new double[] {x1, x2};
        } else if(diskriminante == 0){
            double result = -b/ (2*a);
            return new double[] {result};
        }else {
            return new double[]{};
        }
    }

}
