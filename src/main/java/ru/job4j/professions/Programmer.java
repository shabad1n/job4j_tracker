package ru.job4j.professions;

public class Programmer extends Engineer {

    public Programmer(String name, String surname, String education,
                      String birthday, boolean secrecy, boolean category, String status) {
        super(name, surname, education, birthday, secrecy, category, status);
    }

    public void composeTR() {
    }

    public void agreementTR() {
    }

    public static void main(String[] args) {
        Programmer ivan = new Programmer("IVan", "Petrov",
                "higher", "05.05.1995", true, true, "junior");
        System.out.println(ivan.getName());
        ivan.composeTR();
    }
}
