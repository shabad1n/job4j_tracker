package ru.job4j.sort.arraysort;

import ru.job4j.stream.StreamUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test extends StreamUsage {
    public static void main(String[] args) {
        int[] array = new int[] {3, 61, 5, 1, 1, 61, 44, 63};
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        System.out.println(list.equals(list1));
       final int MAX_VALUE = 100;
       int[] count = new int[MAX_VALUE];
       for (int i = 0; i < array.length; i++) {
           count[array[i]] = count[array[i]] + 1;
       }
       int arrayindex = 0;
       for (int i = 0; i < count.length; i++) {
           for (int j = 0; j < count[i]; j++) {
               array[arrayindex] = i;
               arrayindex++;
           }
       }
        for (int i = 0; i < array.length; i++) {
            String print = array[i] > 5000000 ? "A" : array[i] >= 1000000
                    ? "Б" : "В";
            System.out.println(print);
        }
    }
}