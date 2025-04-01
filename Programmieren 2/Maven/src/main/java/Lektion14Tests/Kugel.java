package Lektion14Tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Kugel {
    public static double berechneKugelvolumen(double radius)
    {
        double result = (4.0/3.0) * Math.PI * radius * radius * radius;
        return result;
    }
    @Test
    public void testZero() {
        assertEquals(0, berechneKugelvolumen(0), 0.001);
    }

    @Test
    public void testOne() {
        assertEquals(4.188, berechneKugelvolumen(1), 0.001);
    }

    @Test
    public void testFive() {
        assertEquals(523.5987755982989, berechneKugelvolumen(5), 0.001);
    }

    @Test
    public void testNegOne() {
        assertEquals(-4.1887902047863905, berechneKugelvolumen(-1), 0.001);
    }
}

