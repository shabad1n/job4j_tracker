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
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] arrayName = new Item[items.length];
        int temp = 0;
        for(int i = 0; i < size; i++) {
            Item item = items[i];
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
            for (int index = 0; index < size; index++) {
                if (items[index].getId() == id) {
                    rsl = index;
                    break;
                }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = id > 0 && id <= 100 ? true : false;
        if(rsl) {
            item.setId(id);
            items[index] = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = id > 0 && id <= 100 ? true : false;
        if(rsl) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
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