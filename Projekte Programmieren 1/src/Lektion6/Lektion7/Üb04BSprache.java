package Lektion7;
import java.util.Scanner;

public class Üb04BSprache {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("geben sie einen Satz ein: ");
        String eingabe = scanner.nextLine();
        System.out.println(BSprache(eingabe));
    }

    private static String BSprache(String eingabe){
        char[] alte_eingabe = eingabe.toCharArray();
        char[] neue_eingabe = new char[alte_eingabe.length + (count_vowels(alte_eingabe) *  2)];
        int index = 0;
        for (int i = 0; i < alte_eingabe.length; i++) {
            if (is_vowel(alte_eingabe[i])){
                neue_eingabe[index] = alte_eingabe[i];
                neue_eingabe[index + 1] = 'b';
                neue_eingabe[index + 2] = alte_eingabe[i];
                index += 3;
            }
            else{
                neue_eingabe[index] = alte_eingabe[i];
                index += 1;
            }
        } return String.valueOf(neue_eingabe);
    }

    private static int count_vowels(char[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(is_vowel(arr[i])) count++;
        } return count;
    }

    private static boolean is_vowel(char val){
        switch (val){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            return true;
            default:
                return false;
        }
    }
}
