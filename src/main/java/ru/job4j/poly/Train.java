package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " движется по рельсам");
    }

    @Override
    public void maxSpeed() {
        int speed = 150;
    }
}
