package ru.job4j.stream.task;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalFlatMap {
    public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream()
                .filter(n -> n.endsWith(".java"))
                .mapToInt(String::length)
                .boxed()
                .findFirst();
    }

    public static void main(String[] args) {
        List<String> list = List.of("Hello.java", "Hello.js", "Hello.py");
        System.out.println(flatMap(list));
    }
}
