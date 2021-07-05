package ru.job4j.oop;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int temp = Math.max(first, second);
        return Math.max(temp, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        int firstmax =  Math.max(first, second);
        int secondmax = Math.max(third, fourth);
        return Math.max(firstmax, secondmax);
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 1, 3, 4);
        System.out.println(rsl);
    }
}

