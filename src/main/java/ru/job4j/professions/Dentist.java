package ru.job4j.professions;

public class Dentist extends Doctor {


    public void primarySearch() {
    }

    public void correctionOfTheJaw() {
    }

    public static void main(String[] args) {
        Dentist max = new Dentist();
        max.setHospitalNumber(51);
        max.primarySearch();
    }
}
