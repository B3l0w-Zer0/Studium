package Prüfungsvorbereitung;

public class L6Üb2 {
    public static void main(String[] args){
        System.out.println(fakultät(-3));
    }
    public static int fakultät(int zahl){
        int result = 1;
        if(zahl < 1){
            System.out.println("Gib doch eine normale Zahl ein du Hurensohn. Denk halt mal nach! Wichser! Dein Stammbaum ist ein Kreis!");
        }
        for (int i = 1; i <= zahl; i++){
            result *= i;
        }
        return result;
    }
}
