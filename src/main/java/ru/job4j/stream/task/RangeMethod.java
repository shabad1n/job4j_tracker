package ru.job4j.stream.task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RangeMethod {
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }
}
