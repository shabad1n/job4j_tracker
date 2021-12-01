package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String rsl = "";
        if (!list.isEmpty()) {
           rsl += list.get(0);
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello, world");
        getElement(list);
    }
}
