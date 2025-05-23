package Lektion19;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class BrowserTest {

    @Test
    void testBackMethod() {
        Browser browser = new Browser();
        Optional<URL> url = browser.back();

        assertNotNull(url);

        if (url.isPresent()) {
            assertEquals("http://google.de", url.get().toString());
        } else {
            assertTrue(url.isEmpty());
        }
    }
}

