package ru.job4j.lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] str = {
                "Kirill", "Stas", "Ignat"
        };
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return Integer.compare(right.length(), left.length());
        };
        Arrays.sort(str, comparator);
        for (String st : str) {
            System.out.println(st);
        }
    }
}
