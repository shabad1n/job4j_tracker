package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] itemFindAll = new Item[items.length];
        itemFindAll = Arrays.copyOf(items, size);
        return itemFindAll;
    }

    public Item[] findByName(String key) {
        Item[] arrayName = new Item[items.length];
        int temp = 0;
        for(int i = 0; i < size; i++) {
            Item item = items[i];
            if(item.getName() == key) {
                arrayName[i] = item;
                temp++;
            }
        }
        arrayName = Arrays.copyOf(arrayName, temp);
        return arrayName;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        tracker.add(first);
        tracker.add(second);
        tracker.add(new Item("First"));
        tracker.add(new Item("Second"));
        tracker.add(new Item("First"));
        tracker.findByName(first.getName());
    }
}