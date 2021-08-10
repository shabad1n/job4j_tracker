package ru.job4j.pizza;

public class Pizza {
    private String cheeses;

    public String getCheeses() {
        return cheeses;
    }

    public void setCheeses(String cheeses) {
        this.cheeses = cheeses;
    }

    public void CoocDough() {
        System.out.println("Готовим тесто");
    }

    public void Filling() {
        System.out.println("Выкладываем начинку");
    }

    public void Bake() {
        System.out.println("Испекаем пиццу");
    }
}
