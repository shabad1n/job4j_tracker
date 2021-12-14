package ru.job4j.stream.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static List<String> firstThree(List<String> strings) {
        return new ArrayList<>(strings);
    }
}
