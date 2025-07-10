package Prüfungsvorbereitung.Übungsaufgaben.weitere;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L14MitternachtsTests {
    @Test
    public void testroots(){
       /* a = 2.0;
        b = 4.0;
        c = 2.0;
        */

        L14Mitternachts mn = new L14Mitternachts(2.0, 4.0, 2.0);
        double[] roots = mn.roots();
        assertEquals(-1, roots[0], 1e-6);
    }
}
