package ru.job4j.professions;

public class Builder extends Engineer {

    private String objectOfWwork;

    public Builder(String name, String surname, String education, String birthday, boolean secrecy, boolean category, String status, String objectOfWwork) {
        super(name, surname, education, birthday, secrecy, category, status);
        this.objectOfWwork = objectOfWwork;
    }

    public Builder() {
    }

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
