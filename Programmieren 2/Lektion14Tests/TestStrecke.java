package Lektion14Tests;
import Lektion14.Strecke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStrecke {
    @Test
    public void AbiggerB() {
        Strecke s = new Strecke(7, 4);
        assertTrue(s.A < s.B);
    }

    @Test
    public void correct() {
        Strecke strecke = new Strecke(2, 3);
        assertTrue(2 == strecke.getA());
        assertTrue(3 == strecke.getB());
    }

    @Test
    public void notcorrect() {
        Strecke streckeZwei = new Strecke(3, 2);
        assertTrue(2 == streckeZwei.getA());
        assertTrue(3 == streckeZwei.getB());
    }

    @Test
    public void ueberschneidenIncorr() {
        Strecke streckeversch = new Strecke(3, 1);
        assertEquals(false, streckeversch.ueberschneiden(3, 8));
    }

    @Test
    public void ueberschneidenCorr() {
        Strecke streckeversch = new Strecke(1, 4);
        assertEquals(true, streckeversch.ueberschneiden(1, 4));
    }
    @Test
    public void ANeg(){
        try{
        Strecke streckeA = new Strecke(-1, 2);
        fail("Runtime Exception Expected");
    } catch(Exception e){
            assertEquals("A or B are negative", e.getMessage());
        }
    }
}
