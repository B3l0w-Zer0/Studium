package Prüfungsvorbereitung.Übungsaufgaben.Prüf.MusikStueck;

import org.junit.jupiter.api.Test;

import java.util.*;

public class MusikStueckSammlung {
    Map<String, List<String>> MusikStuecke = new HashMap<>();

    public void MusikStueckEinfuegen(MusikStueck m){
        if(MusikStuecke.containsKey(m.titel)){
            throw new IllegalArgumentException("Existiert bereits");
        }else {
            MusikStuecke.put(m.titel, List.of(m.interpret, String.valueOf(m.laenge)));
        }
    }

    public List<MusikStueck> umwandeln(){
        List<MusikStueck> liste = new ArrayList<>();

        for (Map.Entry<String, List<String>> eintrag : MusikStuecke.entrySet()) {
            String titel = eintrag.getKey();
            List<String> infos = eintrag.getValue();
            String interpret = infos.get(0);
            int laenge = Integer.parseInt(infos.get(1));

            liste.add(new MusikStueck(titel, interpret, laenge));
        }
        return liste;
    }

    public List<MusikStueck> getAlleMusikStueckeNachTitel() {
        List<MusikStueck> umgewandelt = umwandeln();
        Collections.sort(umgewandelt, new VergleicheMusikStueckTitel());
        return umgewandelt;
    }

    public List<MusikStueck> getAlleMusikStueckeNachLaenge() {
        List<MusikStueck> umgewandelt = umwandeln();
        Collections.sort(umgewandelt, new VergleicheMusikStueckLaenge());
        return umgewandelt;
    }
}

