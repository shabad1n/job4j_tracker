package ru.job4j.collection.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        if (list.contains(str)) {
            return list.indexOf(str) == list.lastIndexOf(str);
        }
        return false;
    }
}
