package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

/*Задание: вам необходимо реализовать метод, который
будет возвращать первую строку из коллекции строк, но прежде чем получить результат
        - необходимо проверить содержатся ли элементы в списке.
        Если их нет - возвращаем пустую строку, иначе - первый элемент в коллекции.*/

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String rsl = "";
        if (!list.isEmpty()) {
           rsl += list.get(0);
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello, world");
        getElement(list);
    }
}
