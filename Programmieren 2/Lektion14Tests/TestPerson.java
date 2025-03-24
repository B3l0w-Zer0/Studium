package Lektion14Tests;
import Lektion14.Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPerson {
  @Test
    public void testNameLower() {
        try {
            Adresse adresse= new Adresse("Test", "42", 97505, "SW");
            Person person = new Person("jan", "Hannig", adresse);
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            assertEquals("Not an uppercase letter", e.getMessage());
        }
    }

    @Test
    public void testStreetLower() {
        try {
            Adresse adresse= new Adresse("test", "42", 97505, "SW");
            Person person = new Person("Jan", "Hannig", adresse);
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            assertEquals("Not an uppercase letter", e.getMessage());
        }
    }

    @Test
    public void testNumberFalse() {
        try {
            Adresse adresse= new Adresse("Test", "Test", 97505, "SW");
            Person person = new Person("Jan", "Hannig", adresse);
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            assertEquals("Not a number", e.getMessage());
        }
    }
    @Test
    public void testOrtLower() {
        try {
            Adresse adresse= new Adresse("Test", "42", 97505, "sw");
            Person person = new Person("Jan", "Hannig", adresse);
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            assertEquals("Not an uppercase letter", e.getMessage());
        }
    }

    @Test
    public void testCorrect() {
        try {
            Adresse adresse= new Adresse("Test", "42", 97505, "SW");
            Person person = new Person("Jan", "Hannig", adresse);
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            assertEquals("Not an uppercase letter", e.getMessage());
        }
    }
}
