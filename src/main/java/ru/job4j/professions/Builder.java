package ru.job4j.professions;

public class Builder extends Engineer{

    public void sketchProject() {
    }

    public void objectInspection() {
    }

    public static void main(String[] args) {
        Builder Kirill = new Builder();
        Builder Alex = new Builder();
        Kirill.danse(); // Наследование метода danse от класса Engineer
        Alex.sketchProject();
    }
}
