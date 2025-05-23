package Lektion18.touppercasewriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.Test;

public class ToUpperCaseWriterTest {

  private String write(char inputChar) {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ToUpperCaseWriter writer = new ToUpperCaseWriter(new OutputStreamWriter(baos))) {
      writer.write(inputChar);
      writer.flush();
      return baos.toString();
    } catch (IOException e) {
      fail("IOException: " + e.getMessage());
      return null;
    }
  }

  @Test
  public void testLowertoUpper() {
    assertEquals("A", write('a'));
  }

  @Test
  public void testOne() {
    assertEquals("1", write('1'));
  }

  @Test
  public void testAZConverted() {
    for (char c = 0; c < 128; c++) {
      char expected;
      if (c >= 'a' && c <= 'z') {
        expected = Character.toUpperCase(c);
      } else {
        expected = c;
      }

      assertEquals(String.valueOf(expected), write(c), "Fehler bei Zeichen: " + (int) c);
    }
  }

  @Test
  public void testAZUnchanged() {
    for (char c = 0; c < 128; c++) {
      if (c < 'a' || c > 'z') {
        assertEquals(String.valueOf(c), write(c), "Fehler bei Zeichen: " + (int) c);
      }
    }
  }
}