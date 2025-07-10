package Prüfungsvorbereitung.ChatGPT;

import java.util.ArrayList;
import java.util.List;

public class testtest {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<>();
        list1.add("String1");

        List<? extends String> zahlen = new ArrayList<String>();

        List<? super String> liste = new ArrayList<String>();
        liste.add("42");
        liste.add("23513246");
        System.out.println(liste);
    }
}
