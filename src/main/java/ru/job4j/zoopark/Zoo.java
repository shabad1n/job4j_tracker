package ru.job4j.zoopark;

import java.util.function.Predicate;

public class Zoo {

    public static void main(String[] args) {
        Bear potap = new Bear();
        potap.setAge(6);
        Bear potap2 = new Bear();
        potap2.setAge(7);
        potap.getNumLegs(potap, a -> a.getAge() > 5);
    }
}
