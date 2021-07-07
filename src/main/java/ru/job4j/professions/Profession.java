package ru.job4j.professions;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;


    public void getName(String name) {
        this.name = name;
    }

    public void getSurname(String surname) {
        this.surname = surname;
    }

    public void getEducation(String education) {
        this.education = education;
    }

    public void getBirthday(String birthday) {
        this.birthday = birthday;
    }
}
