package ru.job4j.zoopark;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface Predator {
    public String getNumLegs(Bear bear, Predicate<Bear> predicate);
}
