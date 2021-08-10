package ru.job4j.pizza;

public class PizzaShop {
    private final SimplePizzaFactory simplePizzaFactory;

    public PizzaShop(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(PizzaType.PizzaTypeTwo type) {
        Pizza pizza = simplePizzaFactory.creatPizza(type);
        pizza.CoocDough();
        pizza.Filling();
        pizza.Bake();
        System.out.println("Ваша пицца");
        return pizza;
    }

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaShop pizzaShop = new PizzaShop(simplePizzaFactory);
        pizzaShop.orderPizza(PizzaType.PizzaTypeTwo.FOURCHEESES);
    }
}
