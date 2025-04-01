package Lektion15Tests;

import Lektion15.PersonAbstrakt;
import Lektion15.Professor;
import Lektion15.Student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPersonMain {

    @Test
    public void TestListe() {
            PersonAbstrakt[] Liste = new PersonAbstrakt[100];
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    Liste[i] = new Student("Programmieren");
                    System.out.println(Liste[i].gibTaetigkeitAus());
                    assertEquals("Der Student besucht das Fach Programmieren", Liste[i].gibTaetigkeitAus(), "Fehler an Stelle: " + i);
                } else {
                    Liste[i] = new Professor("Programmieren");
                    System.out.println(Liste[i].gibTaetigkeitAus());
                    assertEquals("Der Professor unterrichtet Programmieren", Liste[i].gibTaetigkeitAus(), "Fehler an Stelle: " + i);
                }
            }
        }
    }
