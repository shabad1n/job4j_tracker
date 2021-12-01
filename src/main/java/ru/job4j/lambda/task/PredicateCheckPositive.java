package ru.job4j.lambda.task;

import java.util.function.Predicate;

public class PredicateCheckPositive {

    public static boolean check(int num) {
        return check(rsl -> rsl > 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}