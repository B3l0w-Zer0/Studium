package Lektion8;

public class Üb02Argumente {
    public static void main(String[] args){
        if(args.length > 2 || args.length < 2){
            System.out.println("Geben sie genau 2 Werte ein");
        }
        else{
            int result = Integer.valueOf(args[0]) * Integer.valueOf(args[1]);
            System.out.println(result);
        }
    }
}
