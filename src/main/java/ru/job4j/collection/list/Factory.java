package ru.job4j.collection.list;

//Задание: в методе вам нужно заполнить коллекцию значениями от first до fifth
// с помощь фабричного метода of().
// После этого с помощью цикла for() с индексами и метода get() вывести все элементы.

import java.util.List;

public class Factory {
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
        for (String rsl : list) {
            System.out.println(rsl);
        }
    }
}
