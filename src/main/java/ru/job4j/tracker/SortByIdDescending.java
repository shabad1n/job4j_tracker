package ru.job4j.tracker;

import java.util.Comparator;


public class SortByIdDescending implements Comparator<Item> {
    @Override
    public int compare(Item ferst, Item second) {
        return Integer.compare(second.getId(), ferst.getId());
    }
}
