package ru.job4j.tracker;

import java.util.*;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
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
        List copy = List.copyOf(items);
        return copy;
    }

    public List<Item> findByName(String key) {
        List<Item> arrayName = new ArrayList<>();
        for (Item item : items) {
            if(item.getName().equals(key)) {
                arrayName.add(item);
            }
        }
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
            items.set(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if(rsl) {
            items.remove(index);
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
        System.out.println(tracker.findAll());
        List<Item> it = new ArrayList<>(tracker.findAll());
            Collections.sort(it, new SortByNameDescending());
            System.out.println(it);
    }
}