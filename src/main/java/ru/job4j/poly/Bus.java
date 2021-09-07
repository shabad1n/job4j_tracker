package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        int maxSpeed = 130;
    }

    @Override
    public void passengers(int passenger) {
        int maxCountPassan = 60;
    }

    @Override
    public int fill(int count) {
        int sum = 0;
        if (count > 0) {
            sum = count * 45;
        }
        return sum;
    }
}
