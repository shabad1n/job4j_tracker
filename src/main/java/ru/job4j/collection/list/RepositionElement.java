package ru.job4j.collection.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        int i = list.size() - 1;
        String remove = list.remove(i);
        if (index < i) {
            list.set(index, remove);
        }
        return list;
    }
}
