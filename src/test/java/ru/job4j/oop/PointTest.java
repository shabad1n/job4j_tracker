package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PointTest  {

    @Test
    public void Point() {
        Point a = new Point(0, 4);
        Point b = new Point(0, 0);
        double expected = 4.0;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0);
    }
}