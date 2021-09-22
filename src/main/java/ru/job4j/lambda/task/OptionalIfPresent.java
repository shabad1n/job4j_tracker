package ru.job4j.lambda.task;

import java.util.Optional;
import java.util.function.Function;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(temp -> System.out.println("Max: " + temp));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length <= 0) {
            return Optional.empty();
        }
        int max = 0;
        for (int rsl : data) {
             max = Math.max(max, rsl);
            }
        return Optional.of(max);
        }

    public static void main(String[] args) {
        ifPresent(new int[] {});
    }
}