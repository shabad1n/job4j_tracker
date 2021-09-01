package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemTest {

    @Test
    public void whenSortByNameDecsending() {
        List<Item> items = Arrays.asList(
                new Item("Kirill"),
                new Item("Constantin"),
                new Item("Stas"),
                new Item("Petr"));
        List<Item> rsl = Arrays.asList(
                new Item("Stas"),
                new Item("Petr"),
                new Item("Kirill"),
                new Item("Constantin")
        );
        Collections.sort(items, new SortByNameDescending());
        Assert.assertEquals(rsl, items);
    }

    @Test
    public void whenSortByNameAscending() {
        List<Item> items = Arrays.asList(
                new Item("Kirill"),
                new Item("Constantin"),
                new Item("Stas"),
                new Item("Petr"));
        List<Item> rsl = Arrays.asList(
                new Item("Constantin"),
                new Item("Kirill"),
                new Item("Petr"),
                new Item("Stas")
        );
        Collections.sort(items, new SortByNameAscending());
        Assert.assertEquals(items, rsl);
    }

    @Test
    public void whenSortByIdAscending() {
        List<Item> items = Arrays.asList(
                new Item("Kirill", 2),
                new Item("Constantin", 1),
                new Item("Stas", 0),
                new Item("Petr", 3)
        );
        List<Item> rsl = Arrays.asList(
                new Item("Stas", 0),
                new Item("Constantin", 1),
                new Item("Kirill", 2),
                new Item("Petr", 3)
                );
        Collections.sort(items, new SortByIdAscending());
        Assert.assertEquals(items, rsl);
    }


    @Test
    public void whenSortByIdDescending() {
        List<Item> items = Arrays.asList(
                new Item("Kirill", 2),
                new Item("Constantin", 1),
                new Item("Stas", 0),
                new Item("Petr", 3)
        );
        List<Item> rsl = Arrays.asList(
                new Item("Petr", 3),
                new Item("Kirill", 2),
                new Item("Constantin", 1),
                new Item("Stas", 0)
        );
        Collections.sort(items, new SortByIdDescending());
        Assert.assertEquals(items, rsl);
    }
}