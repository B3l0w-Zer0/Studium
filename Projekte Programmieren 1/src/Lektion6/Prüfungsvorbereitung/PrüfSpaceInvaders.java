package Prüfungsvorbereitung;
import java.util.Scanner;
import java.util.Arrays;

public class PrüfSpaceInvaders {
    public static final int randomValue;
    static{
        randomValue = (int) (Math.random() * 8);
    }
    public static int Raumschiff(final int space){
        return randomValue;
    }

    private static int PlatzNeu;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] Aliens = new char[5][8];
        for (int i = 0; i < 8; i++) {
            Aliens[0][i] = 'o';
            System.out.print(Aliens[0][i] + " ");
        }
        System.out.println(" ");

        for (int j = 1; j < 4; j++) {
            for (int i = 0; i < 8; i++) {
                Aliens[j][i] = ' ';
                System.out.print(Aliens[j][i] + " ");
            }
            System.out.println(" ");
        }

        final int space = (Raumschiff(1));
        for (int k = 0; k < 8; k++) {

            if (k == space) {
                Aliens[4][k] = 'v';
            } else {
                Aliens[4][k] = ' ';
            }
            System.out.print(Aliens[4][k] + " ");

        }
        System.out.println(space);

        while (true) {
            String line = scanner.nextLine();
            char Platz = line.charAt(0);

            for (int i = 0; i < 8; i++) {
                Aliens[0][i] = 'o';
                System.out.print(Aliens[0][i] + " ");
            }
            System.out.println(" ");

            for (int j = 1; j < 4; j++) {
                for (int i = 0; i < 8; i++) {
                    Aliens[j][i] = ' ';
                    System.out.print(Aliens[j][i] + " ");
                }
                System.out.println(" ");
            }

            int temp = 0;
            int counter = 0;
            if(counter == 0) {
                PlatzNeu = (bewege(Platz));
                for (int k = 0; k < 8; k++) {
                    if (k == PlatzNeu) {
                        Aliens[4][k] = 'v';
                        // temp = k;
                    } else {
                        Aliens[4][k] = ' ';
                    }
                    //space2 = temp;
                    System.out.print(Aliens[4][k] + " ");

                }
                System.out.println(PlatzNeu);
            }else{

            }

            }
        }



    public static int bewege(char bewege) {
        while (true) { //kann gelöscht werden, falls nicht funktioniert lol. safe digga
            int counter = 0;
            int PlatzNeu = 0;
            int PlatzAlt = 0;
            if (counter == 0) {
                int platz = (Raumschiff(1));

                if (bewege == 'a') {
                    if (platz - 1 < 0) {
                        platz = platz;
                    } else {

                        PlatzNeu = platz - 1;
                        counter += 1;
                        return PlatzNeu;

                    }

                } else {
                    if (bewege == 'd') {
                        if (platz + 1 > 7) {
                            platz = platz;
                        } else {
                            PlatzNeu = platz + 1;
                            System.out.println(PlatzNeu);
                            counter += 1;
                            return PlatzNeu;

                        }

                    }
                }

            } else {
                if (bewege == 'a') {
                    if (PlatzNeu - 1 < 0) {
                        PlatzNeu = PlatzNeu;
                    } else {
                        PlatzNeu = PlatzNeu - 1;
                        return PlatzNeu;

                    }
                }
                if (bewege == 'd') {
                    if (PlatzNeu + 1 > 7) {
                        PlatzNeu = PlatzNeu;
                    } else {
                        PlatzNeu = PlatzNeu + 1;
                        return PlatzNeu;
                    }
                }

            }

            return PlatzNeu;
        }

    }

    }




