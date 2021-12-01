package ru.job4j.collection.list;

import java.util.List;

public class Factory {
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
        for (String rsl : list) {
            System.out.println(rsl);
        }
    }
}
