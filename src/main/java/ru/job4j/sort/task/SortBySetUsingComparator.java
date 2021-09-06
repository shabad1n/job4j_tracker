package ru.job4j.sort.task;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySetUsingComparator {
    public static Set<String> sort(List<String> list) {
        Set<String> sort = new TreeSet(Comparator.reverseOrder());
        sort.addAll(list);
        return sort;
    }

    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "3", "4", "5");
        Set<String> set = sort(list);
        System.out.println(set);
    }
}
