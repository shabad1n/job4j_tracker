package ru.job4j.stream.task;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static List<String> sorted(List<String> strings) {
        return strings.stream().sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = List.of("Привет", "Мир", "Как дела");
        System.out.println(sorted(list));
    }
}
