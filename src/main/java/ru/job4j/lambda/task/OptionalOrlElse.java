package ru.job4j.lambda.task;

import java.util.Optional;

public class OptionalOrlElse {
    public static Integer orElse(Optional<Integer> optional) {
        return optional.orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(orElse(Optional.of(1)));
    }
}
