package ru.job4j.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Задание: необходимо реализовать метод, который позволит добавить элемент list(значение)
// с ключом index в хранилище store только в том случае,
//        если такого ключа пока еще нет в хранилище.
//        Метод getValue() должен вернуть значение которое соответствует ключу index,
//        если такого ключа нет - необходимо вернуть пустой список.

public class GetOrDefault {
    private Map<Integer, List<String>> store = new HashMap<>();

    public void addValue(int index, List<String> list) {
        if (!store.containsKey(index)) {
            store.put(index, list);
        }
        System.out.println(store);
    }

    public List<String> getValue(int index) {
        return store.getOrDefault(index, new ArrayList<>());
    }

    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three");
        List<String> second = List.of("four", "five", "six");
        List<String> third = List.of("seven", "eight", "nine");
        GetOrDefault get = new GetOrDefault();
        get.addValue(1, list);
        get.addValue(2, second);
        get.addValue(1, third);
        List<String> value = get.getValue(1);
        System.out.println(value);
    }
}
