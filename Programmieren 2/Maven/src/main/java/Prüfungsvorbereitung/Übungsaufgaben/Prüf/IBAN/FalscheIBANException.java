package Prüfungsvorbereitung.Übungsaufgaben.Prüf.IBAN;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FalscheIBANException extends RuntimeException {
    public FalscheIBANException(String message) {
        super(message);
    }
    public FalscheIBANException(){super("Falsche IBAN du NUTTEN");}


    public boolean checkIBAN(String IBAN){
        if(IBAN == null || !IBAN.startsWith("DE") || IBAN.length() != 22){
            throw new FalscheIBANException("Diese Iban ist nicht gültig!");
        }
        return true;
    }

    public List<String> liesIBANAusDatei(String fileName) {
        List<String> ungueltig = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader(fileName))){
           String zeile;
           while((zeile = in.readLine())!= null){
               //zeile = zeile.trim();
               try {
                   checkIBAN(zeile);
                }catch(FalscheIBANException FI){
                   ungueltig.add(zeile);
               }
           }
        }catch(IOException IO){
            IO.getMessage();
        }
        return ungueltig;
    }

    public Map<String, List<String>> liesIbanAusDateien(List<String> files){
        Map<String, List<String>> fileNamesIBAN = new HashMap<>();
        for(String file : files){
            List<String> ungueltig = liesIBANAusDatei(file);
            fileNamesIBAN.put(file, ungueltig);
        }
        return fileNamesIBAN;
    }
}
