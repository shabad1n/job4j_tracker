package ru.job4j.professions;

import javax.print.Doc;

public class Doctor extends Profession {

    private int hospitalNumber;

    public Doctor(String name, String surname, String education, String birthday,
                  int hospitalNumber) {
        super(name, surname, education, birthday);
        this.hospitalNumber = hospitalNumber;
    }

    public int getHospitalNumber() {
        return hospitalNumber;
    }
}
