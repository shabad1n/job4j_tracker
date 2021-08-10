package ru.job4j.pizza;

public class SimplePizzaFactory {

    public Pizza creatPizza(PizzaType.PizzaTypeTwo type) {
        Pizza pizza = null;

        switch (type) {
            case FOURCHEESES:
                pizza = new FourCheeses();
                break;
            case PEPPERONI:
                pizza = new Pepperoni();
                break;
        }
        return pizza;
    }
}
