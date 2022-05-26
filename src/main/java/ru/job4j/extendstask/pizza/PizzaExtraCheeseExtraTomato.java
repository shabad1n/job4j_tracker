package ru.job4j.extendstask.pizza;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        return super.name() + "extra tomato";
    }
}
