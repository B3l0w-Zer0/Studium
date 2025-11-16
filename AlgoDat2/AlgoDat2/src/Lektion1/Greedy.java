package Lektion1;

import java.util.ArrayList;
import java.util.List;

public class Greedy {
    public int[] coins = {50, 10, 5, 2, 1};

    public static void main(String[] args) {
        Greedy g = new Greedy();
        List result = g.greedy(78);
        System.out.println("your change is: " + result);

    }

    public List greedy(int eingabe) {
        List result = new ArrayList();
        if (eingabe > 0) {
            int i = 0;
            while(eingabe > 0){
                if (eingabe >= coins[i]) {
                    eingabe -= coins[i];
                    result.add(coins[i]);
                    i =0;
                }
                else{
                    i +=1;
                }
            }
        }
        return result;
    }
}
