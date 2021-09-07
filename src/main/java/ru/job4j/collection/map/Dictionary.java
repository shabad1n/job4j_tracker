package ru.job4j.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//В данном задании необходимо реализовать словарь. Метод принимает массив строк.
// Необходимо перебрать массив и добавить строки в карту таким образом,
// чтобы ключом был первый символ строки,
// а значением - список строк, которые начинаются на первый символ строки.

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String str : strings) {
            String[] s = str.split("");
            if (!rsl.containsKey(s[0])) {
                rsl.put(s[0], new ArrayList<>());
                for (String ap : strings) {
                    if (ap.charAt(0) == s[0].charAt(0)) {
                        rsl.get(s[0]).add(ap);
                    }
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] data = {"two", "three", "four", "five", "six", "seven"};
        Map<String, List<String>> rsl = Dictionary.collectData(data);
        System.out.println(rsl);
    }
}
