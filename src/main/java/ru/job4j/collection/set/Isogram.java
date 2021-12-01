package ru.job4j.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<String> set = new HashSet<>();
        String[] str = s.split("");
        for (String temp : str) {
            set.add(temp);
        }
        return set.size() == s.length();
    }
}
