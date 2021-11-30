package ru.job4j.lambda.task.linklambda;

public class Factorial {
    public static void main(String[] args) {
    NumericFunc numericFunc = (n) -> {
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl *= i;
        }
        return rsl;
        };
    factorial(numericFunc, 5);
    }

    public static void factorial(NumericFunc n, int fact) {
        System.out.println(n.func(fact));
    }
}
