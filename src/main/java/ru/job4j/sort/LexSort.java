package ru.job4j.sort;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String ferst, String second) {
        String[] st1 = ferst.split("\\.");
        String[] st2 = second.split("\\.");
        int a = Integer.parseInt(st1[0]);
        int b = Integer.parseInt(st2[0]);
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        Arrays.sort(input, new LexSort());
        for(String st : input) {
            System.out.println(st);
        }
    }
}
