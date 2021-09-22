package ru.job4j.lambda.task;

import java.io.PrintStream;
import java.util.function.Consumer;

public class MethodReference {

    public void applyByInstance() {
        Consumer<String> instance = this::consumerByInstance;
       instance.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }

    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();
        methodReference.applyByInstance();
    }
}