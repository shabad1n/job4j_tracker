package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PointTest  {

    @Test
    public void Point2d() {
        Point a = new Point(0, 4);
        Point b = new Point(0, 0);
        double expected = 4.0;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0);
    }

    @Test
    public void Point3d() {
        Point a = new Point(0, 4,0);
        Point b = new Point(4, 0,0);
        double expected = 5.6;
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.1);
    }
}