package ru.job4j.lambda.task;

import java.util.function.Supplier;

public class MRSupplier {
    public static Supplier<String> supplier() {
        Supplier<String> strNew = String::new;
         return strNew;
    }
}
