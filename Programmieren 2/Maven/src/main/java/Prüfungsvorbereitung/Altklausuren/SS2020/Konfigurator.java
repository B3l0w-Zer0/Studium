package Prüfungsvorbereitung.Altklausuren.SS2020;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Konfigurator {
    public static List<String> liesKonfigurationsdatei(String name) throws IOException {
        List<String> list = new ArrayList<>();
        try(BufferedReader BR = new BufferedReader(new FileReader(name))){
            String zeile;
            while ((zeile = BR.readLine())!= null){
                list.add(zeile);
            }
        }
        return list;
    }

    public static Map<String, String> inMap(String name) throws IOException {
        Map<String, String> konfigMap = new HashMap<>();
        List<String> list = liesKonfigurationsdatei(name);
        for(String string : list) {
            String[] teile = string.split("=");
            konfigMap.put(teile[0], teile[1]);
        }
        return konfigMap;
    }

    @Test
    public void testMap() throws IOException {
        Map<String, String> Map1 = inMap("C:\\Users\\User\\OneDrive\\Dokumente\\Studium\\2. Semester\\Programmieren 2\\Maven\\src\\main\\java\\Prüfungsvorbereitung\\Altklausuren\\SS2020\\konfig.txt");
        assertEquals(Map.of("mail.transport.protocol", "smtp", "mail.smtp.port", "465"), Map1);
    }
}
