package ru.job4j.lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            int finalTotal = total;
            total = add(
                     () -> finalTotal + num
            );
        }
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            total = add(
                    sum -> sum + num, total
            );
        }
        System.out.println(total);
    }

    private static Integer add(Function<Integer, Integer> calc, int num) {
        return calc.apply(num);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}