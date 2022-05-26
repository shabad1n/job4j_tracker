package ru.job4j.extendstask.ice;

public class IceCream {
    private int weight;

    public IceCream(int weight) {
        this.weight = weight;
    }

    public int price() {
        return weight * 100;
    }
}
