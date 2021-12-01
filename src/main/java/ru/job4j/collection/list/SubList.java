package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int fromindex = list.indexOf(el);
        int tolnindex = list.lastIndexOf(el);
        if (fromindex != -1 && tolnindex != -1 && fromindex != tolnindex) {
           return list.subList(list.indexOf(el), list.lastIndexOf(el));
        }
        return List.of();
    }
}
