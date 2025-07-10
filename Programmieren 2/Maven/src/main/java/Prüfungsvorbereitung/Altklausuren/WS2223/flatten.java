package Prüfungsvorbereitung.Altklausuren.WS2223;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class flatten {
    public List<String> flatten(List<List<String>> list) {
        List<String> listnew = new ArrayList<>();
        for(List<String> listsmall : list){
            for(String element : listsmall){
                listnew.add(element);
            }
        }
        return listnew;
    }

    //andere variante mit add all
    public List<String> flatten2(List<List<String>> list) {
        List<String> listnew = new ArrayList<>();
        for(List<String> listsmall : list){
            listnew.addAll(listsmall);
        }
        return listnew;
    }

    public static void main(String[] args){
        flatten flatten = new flatten();
        List<List<String>> verschachtelt = new ArrayList<>();
        verschachtelt.add(Arrays.asList("Hallo", "Welt"));
        verschachtelt.add(Arrays.asList("Tschüssli", "Muessli"));
        verschachtelt.add(Arrays.asList("Mark", "MARK", "Copilot"));

        List<String> flach = flatten.flatten2(verschachtelt);
        System.out.println(flach);
    }

    /*
    b)
    public static <T> List<T> flatten(List<List<T>> nestedList) {
    List<T> result = new ArrayList<>();
    for (List<T> innerList : nestedList) {
        result.addAll(innerList);
    }
    return result;
}

     */
}
