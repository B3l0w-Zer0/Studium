package Lektion11;

import javax.print.attribute.HashPrintJobAttributeSet;

public class Üb02TicTacToe {
    public static void main(String[] args){
        boolean[][][] TicTacToe = new boolean[3][3][3];
        for (int i = 0; i < TicTacToe.length; i++){
            for (int j = 0; j < TicTacToe[i].length; j++){
                for (int HILFE = 0; HILFE < TicTacToe[i][j].length; HILFE++){
                    if(Math.random() < 0.5){
                        TicTacToe[i][j][HILFE] = true;
                    }
                    else{
                        TicTacToe[i][j][HILFE] = false;
                    }
                        System.out.print(TicTacToe[i][j][HILFE] ? "x" : "o");

                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
