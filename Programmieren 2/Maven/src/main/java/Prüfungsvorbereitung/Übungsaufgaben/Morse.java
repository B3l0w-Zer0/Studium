package Prüfungsvorbereitung.Übungsaufgaben;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Morse {
    Map<String, String> Hashmap = new HashMap();
    public static String charToMorseCode(char c) {
        String morseCode = switch (c) {
            case 'A' -> ".-";
            case 'B' -> "−...";
            case 'C' -> "−.-.";
            case 'D' -> "-..";
            case 'E' -> ".";
            case 'F' -> "..-.";
            case 'G' -> "--.";
            case 'H' -> "....";
            case 'I' -> "..";
            case 'J' -> ".---";
            case 'K' -> ".";
            case 'L' -> ".-..";
            case 'M' -> "--";
            case 'N' -> "-.";
            case 'O' -> "---";
            case 'P' -> ".--.";
            case 'Q' -> "--.-";
            case 'R' -> ".-.";
            case 'S' -> "...";
            case 'T' -> "-";
            case 'U' -> "..-";
            case 'V' -> "...-";
            case 'W' -> ".--";
            case 'X' -> "-..-";
            case 'Y' -> "-.--";
            case 'Z' -> "--..";
            default ->
                    throw new RuntimeException("Unexpected value: "+c);
        };
        return morseCode;
    }

    public HashMap<String, String> getMorseCodeMap(){
        for (char current = 'A'; current <= 'Z'; current++){
            Hashmap.put(String.valueOf(current), charToMorseCode(current));
        }
        return (HashMap<String, String>) Hashmap;
    }

    public String zeichenKetteToMorse(String s){
        char[] Wort = s.trim().toCharArray();
        String result ="";
        for (int i = 0; i < Wort.length; i++){
            result += Hashmap.get(String.valueOf(Wort[i]));
            result += " ";
        }
        return result;
    }

    @Test
    public void TestCAT(){
        getMorseCodeMap();
        assertEquals(zeichenKetteToMorse("CAT"), "−.-. .- - ");
    }


}
