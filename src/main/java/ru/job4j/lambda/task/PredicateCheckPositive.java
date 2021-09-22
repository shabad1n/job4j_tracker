package ru.job4j.lambda.task;

import java.util.function.Predicate;

/*Ниже приведен код. Вам нужно дописать лямбда выражение,
        которое возводит переданное число в квадрат (для 2 = 4, для 3 = 9 и тд)*/

public class PredicateCheckPositive {

    public static boolean check(int num) {
        return check(rsl -> rsl > 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}