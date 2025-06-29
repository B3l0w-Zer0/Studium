package Lektion23.Ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class kreuzwortAnonClass implements Comparator<String> {
    static String[] alleWoerter = {"Bienenschwarm", "Buch", "Bibel",
            "Beige", "Barriere", "Bein", "Beil", "Christ", "Christian", "Carmen"};

    @Override
    public int compare(String s1, String s2) {
        int diff = Integer.compare(s1.length(), s2.length());
        return diff != 0 ? diff : s1.compareTo(s2);
    }

    public static void main(String[] args){
        TreeSet<String> t = new TreeSet<>(new Lektion22.Comparator.Kreuzwort());
        t.addAll(Arrays.asList(alleWoerter));
        for (String wort : t) {
            System.out.println(wort);
        }

    }

    private static void anon_class(){
        TreeSet<String> t = new TreeSet<>((s1, s2) -> {
            int diff = Integer.compare(s1.length(), s2.length());
            return diff != 0 ? diff : s1.compareTo(s2);
        });
        t.addAll(Arrays.asList(alleWoerter));
        for (String wort : t) {
            System.out.println(wort);
        }
    }
}

