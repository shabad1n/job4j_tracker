package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Создается новая коллекция при помощи интервейса stream и его методов
 */

public class StreamUsage {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, -2, -3, 4, -5, 10, -12, 13, 14, 15);
        List<Integer> posNum = numbers.stream().filter(num -> num.intValue() > 0)
                .collect(Collectors.toList());
    }
}
