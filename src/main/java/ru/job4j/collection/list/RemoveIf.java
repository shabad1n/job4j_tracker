package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        list.removeIf(n -> (n.length() < 5));
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        sortList(list);
    }
}
