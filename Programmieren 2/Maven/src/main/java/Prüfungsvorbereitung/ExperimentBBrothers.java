package Prüfungsvorbereitung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExperimentBBrothers {
    public static void main(String[] args) {
        List<String> bBrothers = Arrays.asList("Burt", "Bronski", "Peter");

        List<String> impostors = new ArrayList<>();
        List<String> realTopG = new ArrayList<>();

        bBrothers.stream().forEach(name -> {
                    if (name.startsWith("B")) {
                        realTopG.add(name);
                    }
                    else {
                        impostors.add(name);
                    }
                }
        );
        realTopG.forEach(System.out::println);
        System.out.println("Impostors are: ");
        impostors.forEach(System.out::println);

    }
}
