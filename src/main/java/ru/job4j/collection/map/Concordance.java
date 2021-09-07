package ru.job4j.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Метод принимает строку, при этом слова могут содержать как строчные символы, так и прописные.
// При реализации необходимо игнорировать пробелы во входной строке.
// Необходимо реализовать метод, который вернет отображение, в котором ключом будет символ из
// строки, а значением - список индексов,
// под которыми этот символ (если таких символов несколько) входит в исходную строку.
// Важно: строчные и прописные символы считаются разными символами.

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
