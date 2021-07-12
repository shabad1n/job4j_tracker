package ru.job4j.oop;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, second) > third ? max(first, second) : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, second, third) > fourth ? max(first, second, third) : fourth;
    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 1, 3);
        System.out.println(rsl);
    }
}

