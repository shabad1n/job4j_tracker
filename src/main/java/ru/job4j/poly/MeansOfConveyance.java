package ru.job4j.poly;

public class MeansOfConveyance {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{car, plane, train};
        for (Vehicle a : vehicles) {
            a.move();
            a.maxSpeed();
        }
    }
}
