package Lektion17;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

/*b[]: Das Array darf nicht null sein.
off: Der Offset muss zwischen 0 und b.length - 1 liegen.
len: Die Länge muss positiv sein und off + len darf b.length nicht überschreiten.
 */

public class OutputStream {

        @Test
        void testWriteWithValidParameters() throws IOException {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] data = {1, 2, 3, 4, 5};
            outputStream.write(data, 1, 3); // Sollte erfolgreich sein
            assertEquals(3, outputStream.size());
        }

        @Test
        void testWriteWithNullArray() {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            assertThrows(NullPointerException.class, () -> outputStream.write(null, 0, 1));
        }

        @Test
        void testWriteWithNegativeOffset() {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] data = {1, 2, 3, 4, 5};
            assertThrows(IndexOutOfBoundsException.class, () -> outputStream.write(data, -1, 3));
        }

        @Test
        void testWriteWithExcessiveLength() {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] data = {1, 2, 3, 4, 5};
            assertThrows(IndexOutOfBoundsException.class, () -> outputStream.write(data, 2, 5));
        }
    }

