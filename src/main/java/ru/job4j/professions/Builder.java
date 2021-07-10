package ru.job4j.professions;

public class Builder extends Engineer {

    private String objectOfWwork;

    public Builder(String name, String surname, String education, String birthday, boolean secrecy, boolean category, String status, String objectOfWwork) {
        super(name, surname, education, birthday, secrecy, category, status);
        this.objectOfWwork = objectOfWwork;
    }

    public void sketchProject() {
    }

    public void objectInspection() {
    }

    public static void main(String[] args) {
        Builder Kirill = new Builder("Ivan", "Petrov", "higher", "05.05.1995", true, true, "junior", "sсhool");
        Builder Alex = new Builder("Ivan", "Petrov", "higher", "05.05.1995", true, true, "junior", "sсhool");
        Kirill.danse(); // Наследование метода danse от класса Engineer
        Alex.sketchProject();
    }
}
