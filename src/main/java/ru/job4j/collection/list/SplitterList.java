package ru.job4j.collection.list;

//Задание: метод принимает 3 списка элементов:
//        1. Общий список элементов;
//        2. Список важных элементов, но не обязательных;
//        3. Список элементов, которые обязательно должны отсутствовать в результирующем списке.
//        Необходимо реализовать метод, который вернет список, основой которого будет первый,
//        присутствовать элементы из второго и точно отсутствовать элементы из третьего.
//        Используйте методы о которых говорилось выше.

import java.util.ArrayList;
import java.util.List;

public class SplitterList {
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        left.retainAll(middle);
        left.removeAll(right);
        return left;
    }

    public static void main(String[] args) {
        List<String> left = new ArrayList<>();
        left.add("one");
        left.add("two");
        left.add("three");
        left.add("four");
        left.add("five");
        left.add("six");
        left.add("seven");
        left.add("eight");
        left.add("nine");
        left.add("ten");
        List<String> middle = List.of(
                "one", "two", "four", "five", "seven", "eight", "nine"
        );
        List<String> right = List.of(
                "two", "five", "nine"
        );
        split(left, middle, right);
    }
}
