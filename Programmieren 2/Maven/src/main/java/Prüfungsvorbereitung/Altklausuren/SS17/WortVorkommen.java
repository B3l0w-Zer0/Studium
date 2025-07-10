package Prüfungsvorbereitung.Altklausuren.SS17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static javax.swing.UIManager.get;

public class WortVorkommen {
    HashMap<Wort, List<Position>> Wort = new HashMap<>();

    public void einfuegen(Wort wort, Position p1){
        if(Wort.containsKey(wort)){
            List<Position> positionen = Wort.get(wort);
            positionen.add(p1);
        }else{
            Wort.put(wort, List.of(p1));
        }
    }

    public List<Position> holeAlle(Wort wort){
        return this.Wort.get(wort);
    }

    public Position holeLetztePosition(Wort wort){
        List<Position> positionen = Wort.get(wort);
        int letzte = positionen.size() -1;
        return positionen.get(letzte);
    }

    public int anzahlVorkommen(Wort wort){
        if(Wort.containsKey(wort)){
            return this.holeAlle(wort).size();
        }else{
            throw new RuntimeException("Das Wort kommt nicht vor du nutten.");
        }
    }
}
