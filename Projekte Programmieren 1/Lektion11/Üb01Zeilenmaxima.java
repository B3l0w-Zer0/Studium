package Lektion11;

public class Üb01Zeilenmaxima {
    public static void main(String[] args) {
        double[][] max = {{4, 5}, {7, 9}};

        double[] Ergebnis = zeilenMaxima(max);

        for(int i= 0; i < Ergebnis.length; i++){
            System.out.println(Ergebnis[i]);
        }

    }
    public static double[] zeilenMaxima(double[][] max){
        double[] max1 = new double[max.length];
        double maximum = -99999999;
    for(int i = 0; i < max.length; i++)
    {
        for(int j = 0; j < max[i].length; j++){
            if(max[i][j] > maximum) maximum = max[i][j];

        }
        max1[i] = maximum;
        maximum = -9999999;

    }
return max1;
}
}
