package Lektion9;

import java.util.Scanner;

public class Üb01Car{
//emotional support text
    public static void main(String[] args){
        double max = -1;
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of cars you want to compare: ");
        int amount = sc.nextInt();sc.nextLine();*/
        Üb01CarConstructor[] cars = {new Üb01CarConstructor("Tesla", "model x", "green", 1700), new Üb01CarConstructor("Tesla", "model s", "blue", 1800), new Üb01CarConstructor("Tesla", "model f", "pink", -10)};
        System.out.println(Üb01CarConstructor.getAnzahlautos());
        Üb01CarConstructor car = new Üb01CarConstructor("hallo", "halllo", "hello", -2);
        System.out.println(car.cubicCapacity);
        car.setCubicCapacity(-3);
        System.out.println(car.cubicCapacity);
        for(int i = 2; i >= 0; i--)

        {
            /*
            System.out.print("\nPlease enter the cars brand: "); String brand = sc.nextLine();
            System.out.print("Please enter the cars model: "); String model = sc.nextLine();
            System.out.print("Please enter the cars colour: "); String colour = sc.nextLine();
            System.out.print("Please enter the cars cubic capacity: "); double cubicCap = sc.nextDouble();sc.nextLine();
            cars[i] = new Üb01CarConstructor(brand, model, colour, cubicCap);*/

            if(max <  cars[i].getCubicCapacity()){max = cars[i].getCubicCapacity();}
        }
        System.out.println(max);



    }
}





