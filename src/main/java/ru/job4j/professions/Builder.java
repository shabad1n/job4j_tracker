package ru.job4j.professions;

public class Builder extends Engineer {

    private String objectOfWwork;

    public Builder(String name, String surname, String education, String birthday,
                   boolean secrecy, boolean category, String status) {
        super(name, surname, education, birthday, secrecy, category, status);
        this.objectOfWwork = objectOfWwork;
    }

    public void sketchProject() {
    }

    public void objectInspection() {
    }

    public static void main(String[] args) {
        Builder kirill = new Builder("Ivan", "Petrov", "higher",
                "05.05.1995", true, true, "junior");
        Builder alex = new Builder("Ivan", "Petrov",
                "higher", "05.05.1995", true, true, "junior");
        kirill.danse(); // Наследование метода danse от класса Engineer
        alex.sketchProject();
    }
}
