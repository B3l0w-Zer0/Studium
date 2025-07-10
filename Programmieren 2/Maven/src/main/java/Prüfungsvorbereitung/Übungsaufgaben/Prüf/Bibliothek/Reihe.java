package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Bibliothek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reihe {
    Map<String, List<Buch>> Reihe;

    public Reihe() {
        this.Reihe = new HashMap<>();
    }

    public void BuchEinfuegen(String name, List<Buch> book){
        if(Reihe.containsKey(name)) {

            List<Buch> books = Reihe.get(name);
            books.addAll(book);
            //Reihe.put(name, books); ist nicht notwendig, da man durch das books eine direkte referenz auf die reihe hat und deshalb es automatisch neu abspeichert.
        }else{
            Reihe.put(name, new ArrayList<> (book));
        }
    }

    public List<Buch> getBuecher(String name){
        return Reihe.get(name);
    }
}
