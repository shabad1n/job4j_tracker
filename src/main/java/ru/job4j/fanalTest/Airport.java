package ru.job4j.fanalTest;

public class Airport {

    public static void main(String[] args) {

        final Airbus airbus = new Airbus("A380");
        System.out.println(airbus);
        airbus.printCountEngine();
        System.out.println(".......................");
        airbus.setName("A320");
        System.out.println(airbus);
        airbus.printCountEngine();
    }
}
