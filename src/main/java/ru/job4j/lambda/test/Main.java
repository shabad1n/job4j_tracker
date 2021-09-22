package ru.job4j.lambda.test;

import ru.job4j.collection.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)  {
        List<Animal> animals = new ArrayList<>();
        Animal cat = new Animal("Cat", 10, true);
        Animal dog = new Animal("Dog", 11, true);
        animals.add(cat);
        animals.add(dog);
        System.out.println(print(animals, Animal::isAbleToJump));
    }

    public static List<Animal> print(List<Animal> list, Predicate<Animal> predicate) {
        List<Animal> getJamp = new ArrayList<>();
        for (Animal temp : list) {
            if (predicate.test(temp)) {
                getJamp.add(temp);
            }
        }
        return getJamp;
    }
}
