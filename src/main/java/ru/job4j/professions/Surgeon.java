package ru.job4j.professions;

public class Surgeon extends Doctor {

    private boolean tools;

    public Surgeon(String name, String surname, String education, String birthday, int hospitalNumber, boolean tools) {
        super(name, surname, education, birthday, hospitalNumber);
        this.tools = tools;
    }

    public void inspection() {
    }

    public void preparationForTheOperation() {
    }

    public void operation() {
    }
}
