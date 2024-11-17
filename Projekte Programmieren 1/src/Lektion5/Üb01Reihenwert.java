package Lektion5;

public class Üb01Reihenwert {
    public static void main(String[] args){
        double sum = 0;
        double previousnum;
        long k = 1;
        do {
            previousnum = sum;
            sum = sum + 1.0 / (k * k);
            k++;
        }
        while (sum - previousnum > 0.000000001);

        System.out.println(6 * sum);
    }
}
