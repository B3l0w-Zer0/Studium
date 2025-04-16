package Lektion16;

import Lektion16.Cyborg.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCyborg {
    RoboterImpl roboter = new RoboterImpl();
    MenschImpl mensch = new MenschImpl();
    Cyborg cyborg = new Cyborg();

    @Test
    public void TestMenschLinks(){
        int counter = 0;
        for (int i = 0; i <= 1000; i++) {
            Entscheidungen menschUnent = mensch.entscheide(Gefahr.Gefahr_Links);
            if (menschUnent == Entscheidungen.Unentschieden) {
                counter++;
            }
        }
        System.out.println(counter);
        assertTrue(counter < 300 && counter > 200);
    }

    @Test
    public void TestCyborg(){
        int counter = 0;
        for (int i = 0; i <= 1000; i++){
            Entscheidungen CyborgUnent = cyborg.entscheideCyborg(Gefahr.Gefahr_Links);
            if (CyborgUnent == Entscheidungen.Unentschieden) {
                counter++;
            }
        }
        System.out.println(counter);
        assertTrue(counter < 150 && counter > 100); //wegen 25 Prozent Chance durch Menschen, dass es unentschieden ist, also nicht übereinstimmt und dann nochmal 50 prozent davon Chance, dass die Menschen-Entscheidung(unentschiedenn)gewählt wird.

    }

    @Test
    public void TestRoboter(){
        for (int i = 0; i <= 1000; i++){
            Entscheidungen RoboterLeft = roboter.entscheide(Gefahr.Gefahr_Links);
            Entscheidungen RoboterRight = roboter.entscheide(Gefahr.Gefahr_Rechts);
            Entscheidungen RoboterFront = roboter.entscheide(Gefahr.Gefahr_Vorne);
            assertEquals(Entscheidungen.Ausweichen_Rechts, RoboterLeft);
            assertEquals(Entscheidungen.Ausweichen_Links, RoboterRight);
            assertEquals(Entscheidungen.Bremsen, RoboterFront);
        }
    }

}

