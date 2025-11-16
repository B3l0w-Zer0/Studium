package Lektion1;

public class Fibonacci {
    public static void main(String[] args){
        Fibonacci f = new Fibonacci();
        int fibo = f.fiboCalc(19);
        System.out.println(fibo);
    }
    public int fiboCalc(int n){
        int fiboN = 0;
        int first = 0;
        int second = 1;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        for(int i = 2; i <= n; i++){
            fiboN = first + second;
            first = second;
            second = fiboN;
        }

        return fiboN;
    }
}
