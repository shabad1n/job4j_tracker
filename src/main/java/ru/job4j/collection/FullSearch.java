package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
           numbers.add(task.getNumber());
        }
        return numbers;
    }

    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(new Task("1", "first task"), new Task("2", "second task"),
                new Task("1", "first task"));
        extractNumber(tasks);
    }
}