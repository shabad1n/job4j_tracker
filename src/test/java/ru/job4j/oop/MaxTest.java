package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void max() {
        int expected = 4;
        int rsl = Max.max(1, 2, 3, 4);
        Assert.assertEquals(expected, rsl);
    }
}