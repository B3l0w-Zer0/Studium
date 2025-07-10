package Prüfungsvorbereitung.Altklausuren.WS2223.Artikel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArtikelTests {
    @Test
    public void testEinmalSpieler(){
        RätselSpiel spiel1 = new RätselSpiel("Escape Room", 1500, 300, true);
        RätselSpiel spiel2 = new RätselSpiel("Code Breaker", 1800, 400, false);
        RätselBuch buch = new RätselBuch("Rätselspaß", 2000, 250, true, 100);

        List<Artikel> eingabeListe = Arrays.asList(spiel1, spiel2, buch);
        List<Artikel> gefiltert = ArtikelFilter.filterEinmalSpielbar(eingabeListe);

        assertEquals(2, gefiltert.size());
        assertTrue(gefiltert.contains(spiel1));
        assertTrue(gefiltert.contains(buch));
        assertFalse(gefiltert.contains(spiel2));
    }
}
