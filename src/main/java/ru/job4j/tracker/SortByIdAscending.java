package ru.job4j.tracker;

import java.util.Comparator;

public class SortByIdAscending implements Comparator<Item> {
    @Override
    public int compare(Item ferst, Item second) {
        return Integer.compare(ferst.getId(), second.getId());
    }
}
