package Prüfungsvorbereitung.Übungsaufgaben.Prüf.MusikStueck;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestMusikStueck {
    MusikStueckSammlung sammlung = new MusikStueckSammlung();

    @Test
    public void testTitel(){
        sammlung.MusikStueckEinfuegen(new MusikStueck("Hello", "Mark", 69));
        sammlung.MusikStueckEinfuegen(new MusikStueck("Arsch", "Cumquest", 12));
        sammlung.MusikStueckEinfuegen(new MusikStueck("Veiny", "hard", 300));
        List<MusikStueck> MusikStuecke = sammlung.getAlleMusikStueckeNachTitel();
        assertEquals("Arsch", MusikStuecke.get(0).titel, "der erste titel wurde nicht richtig gespeichert");
        assertEquals("Hello", MusikStuecke.get(1).titel, "der zweite titel wurde nicht richtig gespeichert");
        assertEquals("Veiny", MusikStuecke.get(2).titel, "der dritte titel wurde nicht richtig gespeichert");
    }

    @Test
    public void testLaenge(){
        sammlung.MusikStueckEinfuegen(new MusikStueck("Hello", "Mark", 69));
        sammlung.MusikStueckEinfuegen(new MusikStueck("Arsch", "Cumquest", 12));
        sammlung.MusikStueckEinfuegen(new MusikStueck("Veiny", "hard", 300));
        List<MusikStueck> MusikStuecke = sammlung.getAlleMusikStueckeNachTitel();
        assertEquals(12, MusikStuecke.get(0).laenge, "die erste Länge wurde nicht richtig gespeichert");
        assertEquals(69, MusikStuecke.get(1).laenge, "die zweite Länge wurde nicht richtig gespeichert");
        assertEquals(300, MusikStuecke.get(2).laenge, "die drittte Länge wurde nicht richtig gespeichert");
    }

}
