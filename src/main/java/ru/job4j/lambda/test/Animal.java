package ru.job4j.lambda.test;

import java.util.Objects;

public class Animal {
    private String name;
    private Integer age;
    private boolean ableToJump;

    public Animal(String name, int age, boolean ableToJump) {
        this.name = name;
        this.age = age;
        this.ableToJump = ableToJump;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isAbleToJump() {
        return ableToJump;
    }

    @Override
    public String toString() {
        return "Animal{"
                + "name='" + name + '\'' + ", age="
                + age + ", ableToJump=" + ableToJump + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Animal animal = (Animal) o;
        return age == animal.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
