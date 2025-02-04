package Prüfungsvorbereitung;

public class L3Üb4 {
    public static void main(String[] args){
        int wurf = (int) (Math.random() * 6 +1);

        switch (wurf){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("6");
        }
    }
}
