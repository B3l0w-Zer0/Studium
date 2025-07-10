package Prüfungsvorbereitung.Übungsaufgaben.Prüf.IBAN;

import Lektion14.Adresse;
import Lektion14.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestIBAN {
    FalscheIBANException IBAN = new FalscheIBANException();

    @Test
    public void checkIban(){
        String Iban = "DE12345678912345678912";
        assertTrue(IBAN.checkIBAN(Iban));
    }

    @Test
    public void checkIbanFalse(){
        String Iban = "DE1234567891234567891234";
        assertThrows(FalscheIBANException.class, () -> {IBAN.checkIBAN(Iban);
        });
    }

    @Test
    public void checkIbanFalse2(){
        try {
            String Iban = "DE1234567891234567891234";
            IBAN.checkIBAN(Iban);
            fail("Runtime Exception expected");
        } catch (RuntimeException e) {
            assertEquals("Diese Iban ist nicht gültig!", e.getMessage());
        }
    }

    @Test
    public void checkIbanFile(){
        List<String> ungueltig = IBAN.liesIBANAusDatei("src/main/java/Prüfungsvorbereitung/Übungsaufgaben/Prüf/IBAN/ibans.txt");
        assertTrue(ungueltig.contains("FF22100100500123456789"));
        assertTrue(ungueltig.contains("DE12345"));
        assertEquals(List.of("FF22100100500123456789", "DE12345"), ungueltig);
    }
}
