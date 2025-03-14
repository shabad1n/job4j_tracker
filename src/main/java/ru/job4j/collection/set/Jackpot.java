package ru.job4j.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> set = new HashSet<>();
        for (String str : combination) {
            set.add(str);
        }
        return set.size() == 1;
    }
}
