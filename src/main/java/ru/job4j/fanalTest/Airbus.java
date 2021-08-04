package ru.job4j.fanalTest;

import java.util.Objects;

public final class Airbus {

    private static final int COUNT_ENGINE = 2;
    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCountEngine() {
        int countEngien = 0;
        if (this.getName().equals("A380")) {
            countEngien = 4;
            System.out.println("Количество двигателей равно: " + countEngien);
        } else {
            System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
        }
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
