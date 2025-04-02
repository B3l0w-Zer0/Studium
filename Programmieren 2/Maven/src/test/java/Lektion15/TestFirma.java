package Lektion15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFirma {

    @Test
    public void testAngestellterGehalt(){
        Angestellter angestellter1 = new Angestellter("Mustermann", "Max", "ID1", 3000, "13.12.1997");
        assertEquals(3000, angestellter1.berechneGehalt());
    }

    @Test
    public void testAngestellterGehaltsfaktor(){
        Angestellter angestellter2 = new Angestellter("Mustermann", "Max", "ID2", 3000, "16.1.1995");
        assertEquals(1.0, angestellter2.getGehaltsfaktor());
    }

    @Test
    public void testBefoerdernGehalt(){
        Angestellter angestellter4 = new Angestellter("Mustermann", "Max", "ID4", 3000, "13.12.1997");
        Abteilungsleiter abteilungsleiter2 = new Abteilungsleiter("Doe", "John", "ID02", 6000, "1.1.1950");
        abteilungsleiter2.befoerdern(angestellter4);
        assertEquals(3300, angestellter4.berechneGehalt(), 0.0001);
    }

    @Test
    public void testBefoerdernFaktor(){
        Angestellter angestellter3 = new Angestellter("Mustermann", "Max", "ID3", 3000, "13.12.1997");
        Abteilungsleiter abteilungsleiter1 = new Abteilungsleiter("Doe", "John", "ID01", 6000, "1.1.1950");
        abteilungsleiter1.befoerdern(angestellter3);
        assertEquals(1.1, angestellter3.getGehaltsfaktor());
    }
}
