package ru.job4j.extendstask.pizza;

public class PizzaExtraCheese extends Pizza {
    @Override
    public String name() {
        return super.name() + "Extra cheese";
    }
}
