package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    //private final Item[] items = new Item[100];
    private int ids = 1;

    public Item add(Item item) {
        items.add(item);
        item.setId(ids++);
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (Item item : items)
            if (item.getId() == id) {
                rsl = item;
                break;
        }
        return rsl;
    }

    public List<Item> findAll() {
        return items;
    }

    public Item[] findByName(String key) {
        Item[] arrayName = new Item[items.size()];
        int temp = 0;
        for (Item item : items) {
            if(item.getName().equals(key)) {
                arrayName[temp] = item;
                temp++;
            }
        }
        arrayName = Arrays.copyOf(arrayName, temp);
        return arrayName;
    }

    private int indexOf(int id) {
        int rsl = -1;
            for (int index = 0; index < items.size(); index++) {
                if (items.get(index).getId() == id) {
                    rsl = index;
                    break;
                }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if(rsl) {
            item.setId(id);
            items.set(id, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if(rsl) {
            items.remove(items.size() - 1);
        }
        return rsl;
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
        Item third = new Item("Third");
      //  tracker.replace(3, third);
        tracker.delete(1);
    }
}