package ru.job4j.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (Integer data : name.keySet()) {
            name.computeIfPresent(data, (key, valeu) -> valeu + " " + surname.get(data));
        }
        return name;
    }

    public static void main(String[] args) {
        Map<Integer, String> name = new HashMap<>(Map.of(1, "Bill", 2, "Donald"));
        Map<Integer, String> surname = new HashMap<>(Map.of(1, "Clinton", 2, "Trump"));
        Map<Integer, String> rsl = ComputeIfPresent.collectData(name, surname);
        System.out.println(rsl);
    }
}
