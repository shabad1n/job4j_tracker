package ru.job4j.collection.list;

import java.util.*;

public class Alphabet {

    public static String reformat(String s) {
        StringBuilder rsl = new StringBuilder();
        List<String > list = new ArrayList<>();
        String[] str = s.split("");
        for(String string : str) {
            list.add(string);
        }
        Collections.sort(list);
        for(String string : list) {
            rsl.append(string);
        }
        return rsl.toString();
    }

    public static void main(String[] args) {
        String str = reformat("javascript");
        System.out.println(str);
    }
}
