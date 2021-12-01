package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (!list.contains(str)) {
            list.add(index, str);
        }
        return check.size() < list.size();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kirill");
        list.add("Bairam");
        addNewElement(list, 0, "Ivan");
        System.out.println(list);
    }
}
