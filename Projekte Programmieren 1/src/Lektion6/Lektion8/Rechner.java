/*package Lektion8;

public class Parameteruebergabe {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Bitte mindestens zwei Zahlen und einen Operator übergeben.");
        } return;
    }
 String operator = args[args.length - 1];
    double result = Double.parseDouble(args[0]);
    for (int i = 1; i < args.length - 1; i++) {
        double number = Double.parseDouble(args[i]);
        if (operator.equals("+")) { result += number; } else if (operator.equals("-")) { result -= number; } else { System.out.println("Ungültiger Operator. Bitte + oder - verwenden."); return; } } System.out.println(result); } }*/
