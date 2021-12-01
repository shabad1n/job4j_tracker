package ru.job4j.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        Set<String> set = new HashSet<>();
       String[] str = s.split("");
        for (String rsl : str) {
            if (!rsl.equals(" ")) {
                set.add(rsl);
            }
        }
        System.out.println(set.size());
        return set.size() >= 26;
    }

    public static void main(String[] args) {
        checkString("Jackdaws love my big sphinx of quartz");
    }
}
