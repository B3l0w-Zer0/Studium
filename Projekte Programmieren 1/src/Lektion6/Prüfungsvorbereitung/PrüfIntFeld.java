package Prüfungsvorbereitung;

public class PrüfIntFeld {
    public static void main(String[] args){
        int counter = 0;
        int[] numbers = {1, 2, 3, 4, -3, 4, 17, 0, 15};
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 3 == 0 && numbers[i] != 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
