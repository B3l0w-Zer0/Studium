package Lektion9;

import java.util.Scanner;

public class Üb02Pizza
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int amount = 5;
        Üb02PizzaConstructor[] pizzas  = new Üb02PizzaConstructor[amount];
        for(int i = 0; i < amount; i++)
        {
            pizzas[i] = pizzaDesigner();

            int bestComb = pizzas[i].getInstance();
            System.out.print("Best combination for " + pizzas[i].getName() + " is: " + pizzas[i].getPrice(bestComb) + "€ with: " + pizzas[i].getDiameter(bestComb) + "cm\n");
        }
    }
    protected static Üb02PizzaConstructor pizzaDesigner()
    {
        System.out.println("Enter the name of the pizza you want to create: ");
        String name = sc.nextLine();
        System.out.println("Please enter the amount of price/ diameter combinations the pizza has");
        int comb = sc.nextInt();sc.nextLine();
        double[] prices = new double[comb];
        double[] diameter = new double[comb];
        for(int j = 1; j <= comb; j++)
        {
            System.out.println("Please enter the price of pizza combination " + j);
            prices[j - 1] = sc.nextDouble();
            System.out.println("Please enter the diameter of pizza combination " + j);
            diameter[j - 1] = sc.nextDouble();
        }
        sc.nextLine();
        return new Üb02PizzaConstructor(name, prices, diameter);
    }
}