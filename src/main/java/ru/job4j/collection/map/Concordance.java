package ru.job4j.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        String st = s.replaceAll("\\s+", "");
        String[] strsl = st.split("");
        for (String str : strsl) {
            map.computeIfAbsent(str.charAt(0), list -> new ArrayList<Integer>());
        }
        for (Character ch : map.keySet()) {
            for (int i = 0; i < strsl.length; i++) {
                if (ch == st.charAt(i)) {
                  map.get(ch).add(i);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "Hello World hello world";
        Map<Character, List<Integer>> rsl = Concordance.collectCharacters(str);
        System.out.println(rsl);
    }
}
