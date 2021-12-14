package ru.job4j.stream.task;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethod {
    public static Stream<Integer> createStream(Collection<Integer> data) {
        return data.stream();
    }

    public static void main(String[] args) {
        System.out.println(createStream(List.of(1, 2, 3, 4, 5)).count());
    }
}
