package ru.job4j.professions;

public class Programmer extends Engineer {

    private boolean personalСomputer;

    public Programmer(String name, String surname, String education, String birthday, boolean secrecy, boolean category, String status,boolean personalСomputer) {
        super(name, surname, education, birthday, secrecy, category, status);
        this.personalСomputer = personalСomputer;
    }

    public void composeTR() {
    }

    public void agreementTR() {
    }

    public static void main(String[] args) {
        Programmer Ivan = new Programmer("Ivan", "Petrov", "higher", "05.05.1995", true, true, "junior", true);
        System.out.println(Ivan.getName());
        Ivan.composeTR();
    }
}
