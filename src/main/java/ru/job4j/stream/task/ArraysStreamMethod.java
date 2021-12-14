package ru.job4j.stream.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStreamMethod {
    public static Stream<Integer> createStream(Integer[] data) {
         return Arrays.stream(data);
    }
}
