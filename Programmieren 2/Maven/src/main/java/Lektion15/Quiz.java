package Lektion15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;


public class Quiz {
    public static String sol1;
    public static String sol2;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Was ist die Hauptstadt von Deutschland?");
        sol1 = scanner.nextLine();
        if(!sol1.equals("Berlin") ){
            System.err.println("Falsch!");
        }else {
            System.out.println("Wie viele Finger hat eine Hand?");
            sol2 = scanner.nextLine();
            if(!sol2.equals("5")){
                System.err.println("Falsch!");
            }

        }
    }

    /*@Test
    public void testSol1(){
        assertEquals("Berlin", sol1);
    }*/
}
