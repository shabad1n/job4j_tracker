package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        int sum = 1;
        int rsl = 0;
        List<Integer> list = new ArrayList<>();
        list.add(first);
        while (count != 1) {
            sum *= denominator;
            list.add(sum);
            count--;
        }
        for (int com : list) {
            rsl += com;
        }
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        generateAndSum(1, 3, 10);
    }
}
