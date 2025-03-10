package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        Collections.addAll(autos, "Ford", "Infiniti");
        for (String brand : autos) {
            System.out.println(brand);
        }
    }
}
