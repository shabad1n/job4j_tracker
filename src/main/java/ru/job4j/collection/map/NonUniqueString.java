package ru.job4j.collection.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String str : strings) {
            if (map.containsKey(str)) {
               map.merge(str, true, (oldV, newV) -> newV);
            } else {
                map.computeIfAbsent(str, value -> false);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] data = {"a", "b", "a", "c", "b"};
        System.out.println(checkData(data));
    }
}
