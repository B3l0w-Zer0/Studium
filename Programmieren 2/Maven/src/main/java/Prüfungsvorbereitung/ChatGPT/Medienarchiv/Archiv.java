package Prüfungsvorbereitung.ChatGPT.Medienarchiv;

import java.time.LocalDate;
import java.util.*;

public class Archiv<T extends Medium> {
    List<T> archiv = new ArrayList<>();

    void hinzufuegen(T medium) {
        archiv.add(medium);
    }

    Optional<T> findeNachTitel(String titel) {
        if (archiv != null) {
            for (T medium : archiv) {
                if (medium.titel.equals(titel)) {
                    return Optional.of(medium);
                }
            }
            return Optional.empty();
        } else {
            throw new RuntimeException("Archiv ist leer");
        }
    }

    /*List<T> alleMedienSortiertNachDatum() {
        for (T medium : archiv) {
            datenliste.add(medium.erstellungsdatum);
        }
        archiv.sort(Comparator.comparing)
        return Optional.of(datenliste);
    }*/
}

