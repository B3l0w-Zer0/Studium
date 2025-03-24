package Lektion14Tests;
import Lektion14.Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {

    @Test
    public void testPerson() {
        try {
            Person person = new Person("jan", "Hannig", "Test", "42", 97505, "SW");
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            assertEquals("Falsche Eingabe", e.getMessage());
        }
    }
}