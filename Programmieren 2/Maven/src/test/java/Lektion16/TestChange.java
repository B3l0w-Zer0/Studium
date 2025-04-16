package Lektion16;

import Lektion16.Change.NewChangeCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestChange {

    @Test
    public void TestChange() {
        NewChangeCalculator calculator = new NewChangeCalculator();
        int[] sum1 = calculator.getChange(5, 56);
        int[] test1 = {1, 0, 1, 0, 0, 1, 1, 2};
        for (int i = 0; i <= 7; i++) {
            assertEquals(test1[i], sum1[i], "Fehler an der Stelle" + i);
        }
    }
}
