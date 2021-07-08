package ru.job4j.professions;

public class Dentist extends Doctor {

    private boolean interns;

    public Dentist(String name, String surname, String education, String birthday, int hospitalNumber, boolean interns) {
        super(name, surname, education, birthday, hospitalNumber);
        this.interns = interns;
    }

    public Dentist() {
    }

    public void primarySearch() {
    }

    public void correctionOfTheJaw() {
    }

    public static void main(String[] args) {
        Dentist max = new Dentist();
        max.primarySearch();
    }
}
