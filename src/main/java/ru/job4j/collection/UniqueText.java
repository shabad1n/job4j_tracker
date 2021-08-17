package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        check.addAll(Arrays.asList(origin));
        for (String dupl : text) {
            if (rsl) {
                rsl = check.contains(dupl);
            } else {
                break;
            }
        }
        System.out.println(rsl);
        return rsl;
    }
}
