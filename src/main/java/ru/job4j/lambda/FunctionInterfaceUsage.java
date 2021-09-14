package ru.job4j.lambda;

import java.util.Collections;
import java.util.function.*;
import java.util.function.Supplier;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "New String For Interface";
        System.out.println(sup.get());
        BiConsumer<String, Integer> consumer = (s1, s2) -> System.out.println(s1 + " " + s2);
        consumer.accept("Привет", 2);
    }
}
