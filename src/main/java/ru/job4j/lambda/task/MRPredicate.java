package ru.job4j.lambda.task;

import java.util.Optional;
import java.util.function.Predicate;

public class MRPredicate {
    public static Predicate<String> predicate() {
        Predicate<String> checkEmpty = String::isEmpty;
        return checkEmpty;
    }

    public static void main(String[] args) {
        Predicate<String> f = MRPredicate.predicate();
        System.out.println(f.test(""));
    }
}