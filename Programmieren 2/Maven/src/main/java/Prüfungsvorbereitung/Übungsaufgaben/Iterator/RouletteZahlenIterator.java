package Prüfungsvorbereitung.Übungsaufgaben.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RouletteZahlenIterator implements Iterator<Integer> {
    public int counter = 0;

    public static void main(String[] args) {
        /*RouletteZahlen RZ = new RouletteZahlen();
            for(int i = 0; hasNext() == true; i++){
                int nextNumber = next();
                if (nextNumber == 0){
                    counter +=1;
                    //hasNext();
                    //System.out.println(nextNumber);
                }
                else{
                    hasNext();
                    //System.out.println(nextNumber);
                }

            }
            throw new NoSuchElementException("Es wurden 3 Nullen erspielt!");

         */


        RouletteZahlenIterator It = new RouletteZahlenIterator();
        It.countZero();

    }

    @Override
    public boolean hasNext() {
        return counter <3;
    }

    @Override
    public Integer next() {
        int nextNumber = (int) (Math.random()*37);
        return nextNumber;
    }

    public void countZero(){
        for(int i = 0; hasNext() == true; i++){
            int nextNumber = next();
            if (nextNumber == 0){
                counter +=1;
                //hasNext();
                //System.out.println(nextNumber);
            }
            else{
                hasNext();
                //System.out.println(nextNumber);
            }

        }
        throw new NoSuchElementException("Es wurden 3 Nullen erspielt!");
    }
}
