package Prüfungsvorbereitung.Übungsaufgaben;

import java.util.HashMap;
import java.util.Map;

public class Morse {
    Map<String, String> Häääääääääääääääääschmäp = new HashMap();
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

    public HashMap<String, String> getMorseCodeMap(String Eingabe){
        for (char current = 'A'; current <= 'Z'; current++){
            Häääääääääääääääääschmäp.put(String.valueOf(current), charToMorseCode(current));
        }
        return (HashMap<String, String>) Häääääääääääääääääschmäp;
    }
}
