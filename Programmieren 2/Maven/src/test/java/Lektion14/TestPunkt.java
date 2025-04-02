package Lektion14;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPunkt {
    Punkt punkt = new Punkt();

    @Test
    public void TestXNeg(){
        try{
            punkt.verschiebePunkt(-1, 1);
            fail("Falsche Eingabe");}
        catch(RuntimeException e){
            assertEquals("Invalid", e.getMessage());
        }
    }

    @Test
    public void TestYNeg(){
        try{
            punkt.verschiebePunkt(1, -1);
            fail("Falsche Eingabe");}
        catch(RuntimeException e){
            assertEquals("Invalid", e.getMessage());
        }
    }

    @Test
    public void TestXBig(){
        try{
            punkt.verschiebePunkt(2000, 1);
            fail("Falsche Eingabe");}
        catch(RuntimeException e){
            assertEquals("Invalid", e.getMessage());
        }
    }

    @Test
    public void TestYBig(){
        try{
            punkt.verschiebePunkt(1, 2000);
            fail("Falsche Eingabe");
        }
        catch(RuntimeException e){
            assertEquals("Invalid", e.getMessage());
        }
    }
}