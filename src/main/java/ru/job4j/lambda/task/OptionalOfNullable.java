package ru.job4j.lambda.task;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String str : strings) {
            if (str == null || str.equals(value)) {
                return Optional.ofNullable(value);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<String> list =  Arrays.asList("a", "b", "c", null);
        System.out.println(OptionalOfNullable.findValue(list, "c"));
    }
}