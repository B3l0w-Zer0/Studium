package Prüfungsvorbereitung.Übungsaufgaben.Iterator;

import java.util.Iterator;

public class RouletteZahlen implements Iterable<Integer>{
    @Override
    public Iterator<Integer> iterator(){
        return new RouletteZahlenIterator();
    }

    /*
    public static void main(String[] args){
        RouletteZahlen RZ = new RouletteZahlen();
        RouletteZahlenIterator IT = new RZ.iterator();

    }
    */

}
