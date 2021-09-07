package ru.job4j.collection.list;

import java.util.List;
import java.util.ListIterator;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        ListIterator<Integer> iterator = data.listIterator(1);
        int temp = data.get(1) - data.get(0);
        int sum = data.get(0);
        while (iterator.hasNext()) {
            if (data.get(iterator.nextIndex()) - data.get(iterator.previousIndex()) == temp) {
                sum += data.get(iterator.nextIndex());
                iterator.next();
            } else {
                sum = 0;
                break;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> data = List.of(
                1, 6, 11, 16, 21,
                26, 31, 36, 41, 46
        );
        checkData(data);
    }
}
