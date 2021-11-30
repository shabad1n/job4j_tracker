package ru.job4j.zoopark;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Bear implements Predator {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
   /* @Override
    public String getEats() {
        return "Медведь кушает мясо";
    }

    @Override
    public String metTransportation() {
        return "Медведь передвигается при помощи лап";
    }*/

    @Override
    public String getNumLegs(Bear bear, Predicate<Bear> predicate) {
        if (predicate.test(bear)) {
            return "Медведь еще живой";
        }
        return "Все плохо";
    }
}
