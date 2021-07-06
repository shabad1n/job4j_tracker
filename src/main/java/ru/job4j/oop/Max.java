package ru.job4j.oop;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return Math.max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return Math.max(max(first, second), max(third, fourth));
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 1, 3);
        System.out.println(rsl);
    }
}

