package ru.job4j.tracker;

import java.util.Comparator;

public class SortByNameDescending implements Comparator<Item> {
    @Override
    public int compare(Item ferst, Item second) {
        return second.getName().compareTo(ferst.getName());
    }
}
