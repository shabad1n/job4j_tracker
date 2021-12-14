package ru.job4j.stream.task;

import java.util.List;

public class NoneMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream().noneMatch(s -> s.length() == 0);
    }
}
