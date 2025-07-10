package Prüfungsvorbereitung.ChatGPT.Bibliothek;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Verleihsystem {
    //public List<Medium> medien;
    public Map<Medium, LocalDate> Medienmap = new HashMap<>();

    public void ausleihen(Medium medium){
        //medien.add(medium);
        Medienmap.put(medium, LocalDate.now());
    }

    public void rueckgabe(Medium medium){
        //medien.remove(medium);
        Medienmap.remove(medium);
    }

    /*public List<Medium> alleAusgeliehenenMedienList(){
        return medien;
    }

     */
    //Das eine oder andere v / ^

    public List<Medium> alleAusgeliehenenMedien(){
        /*List<Medium> medien1 = new ArrayList<>();
        medien1.add((Medium) Medienmap.keySet());
        return medien1;
        List<Medium> medien1 = new ArrayList<>();

        //anderer weg
for (Medium m : Medienmap.keySet()) {
    medien1.add(m);
}
return medien1;

//anderer weg
List<Medium> medien1 = new ArrayList<>();
medien1.addAll(Medienmap.keySet());
return medien1;



        */
        //alternativer, kürzerer weg:
        return new ArrayList<>(Medienmap.keySet());


    }

    public LocalDate getAusleihDatum(Medium medium){
        return Medienmap.get(medium);
    }
}
