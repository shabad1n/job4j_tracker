package ru.job4j.stream.task;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfMethod {
    public static Stream<Character> createStream() {
        return Stream.of('c', 'b', 'q');
    }
}
