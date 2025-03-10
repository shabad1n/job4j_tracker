package ru.job4j.collection.list;

import java.util.Iterator;
import java.util.List;

public class IteratorForList {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "four", "five");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Next element has - " + iterator.hasNext() + ", this element is "
                    + iterator.next());
        }
        System.out.println("Next element has - " + iterator.hasNext());
    }
}
