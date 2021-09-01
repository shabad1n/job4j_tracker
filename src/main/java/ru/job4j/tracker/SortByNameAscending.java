package ru.job4j.tracker;

import java.util.Comparator;


public class SortByNameAscending implements Comparator<Item> {
    @Override
    public int compare(Item ferst, Item second) {
        return ferst.getName().compareTo(second.getName());
    }
}
