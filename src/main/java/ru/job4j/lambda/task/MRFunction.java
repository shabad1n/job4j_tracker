package ru.job4j.lambda.task;

import java.util.function.Function;

public class MRFunction {
    public static Function<Double, Double> apply() {
        Function<Double, Double> calcSqrt = Math::sqrt;
        return calcSqrt;
    }

    public static void main(String[] args) {
        Function<Double, Double> f = MRFunction.apply();
        System.out.println(f.apply(9.0));
    }
}