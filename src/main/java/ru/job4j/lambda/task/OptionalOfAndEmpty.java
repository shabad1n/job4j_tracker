package ru.job4j.lambda.task;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> user = Optional.of(value);
        System.out.println(value);
        System.out.println(user);
        for (String str : strings) {
            if (user.equals(str)) {
                System.out.println("Большая пися слона");
            }
            if (str.equals(value)) {
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        OptionalOfAndEmpty.findValue(list, "c");
    }
}
