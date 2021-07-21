package ru.job4j.poly;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " движется по земле");
    }

    public void maxSpeed() {
        int speed = 100;
    }
}
