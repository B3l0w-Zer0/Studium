package Lektion9;

public class Üb02PizzaConstructor{

    final String name;
    double[] prices;
    double[] diameters;         //arraylist?

    public Üb02PizzaConstructor(String name, double[] prices, double[] diameters)
    {
        this.name = name;
        if(prices.length == diameters.length){
            this.prices  = prices;
            this.diameters  = diameters;
        }else{throw new IndexOutOfBoundsException("Amount of prices and diameters must be the same, they are bound to one another by index in Array");}
    }

    public int getInstance()
    {                                                       //returns index of best size to price ratio in array
        double min = Double.MAX_VALUE;
        int minIn = -1;
        for (int i = 0; i < prices.length; i++) {
            double ratio = prices[i] / diameters[i];
            if(ratio < min){
                min = ratio;
                minIn = i;
            }
        }
        return minIn;
    }

    public String getName(){
        return name;
    }
    public double getPrice(int n)
    {
        return prices[n];
    }
    public double getDiameter(int n)
    {
        return diameters[n];
    }
}


