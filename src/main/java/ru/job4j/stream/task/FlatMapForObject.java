package ru.job4j.stream.task;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(col -> col.stream())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2),
                List.of(3, 4));
        List<Integer> rsllist = flatMap(list);
        for (Integer i : rsllist) {
            System.out.println(i);
        }
    }
}
