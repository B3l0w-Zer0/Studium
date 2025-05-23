package Lektion20;

import java.util.*;

public class MultiMap_Dictionary<Key, Value> {
    private Map<Key, List<Value>> map = new HashMap<>();

    public void put(Key key, Value value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public List<Value> get(Key key) {
        return map.getOrDefault(key, Collections.emptyList());
    }

    // Testing the implementation
    public static void main(String[] args) {
        MultiMap_Dictionary<String, String> dict = new MultiMap_Dictionary<>();

        dict.put("to clean", "reinigen");
        dict.put("to clean", "säubern");
        dict.put("to clean", "putzen");

        dict.put("to expand", "vergrößern");
        dict.put("to expand", "wachsen");

        System.out.println(dict.get("to clean"));  // [reinigen, säubern, putzen]
        System.out.println(dict.get("to expand")); // [vergrößern, wachsen]
    }
}
