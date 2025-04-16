package Lektion16;

import Lektion16.Schach.Brett;
import Lektion16.Schach.Dame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSchach {
    Dame d = new Dame(1, 1);
    Brett brett = d.gibErlaubteFelder();
    boolean brettVergleich[][] = {
            {true,true,true,true,true,true,true,true},
            {true,true,false,false,false,false,false,false},
            {true,false,true,false,false,false,false,false},
            {true,false,false,true,false,false,false,false},
            {true,false,false,false,true,false,false,false},
            {true,false,false,false,false,true,false,false},
            {true,false,false,false,false,false,true,false},
            {true,false,false,false,false,false,false,true}
    };

    @Test
    public void TestDame() {
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                assertEquals(brettVergleich[i][j], brett.brett[i][j], "Fehler bei Feld: " + i + j);
            }
        }

    }
       /* assertEquals(true, brett.brett[1][4]);
    }
    @Test
    public void TestDame2(){
        assertEquals(true, brett.brett[2][1]);
    }
    @Test
    public void TestDame3(){
        assertEquals(true, brett.brett[2][4]);
    }
    @Test
    public void TestDame4(){
        assertEquals(true, brett.brett[2][7]);
    }
    @Test
    public void TestDame1(){
        assertEquals(true, brett.brett[1][4]);
    }*/
}
