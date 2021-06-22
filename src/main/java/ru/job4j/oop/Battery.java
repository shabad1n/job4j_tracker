package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(25);
        Battery two = new Battery(75);
        two.exchange(one);
        System.out.println(two.load);
    }
}
