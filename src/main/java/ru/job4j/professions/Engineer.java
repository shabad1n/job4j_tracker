package ru.job4j.professions;

public class Engineer extends Profession {

    private boolean secrecy;
    private boolean category;
    private String status;

    public Engineer(String name, String surname, String education, String birthday, boolean secrecy, boolean category, String status) {
        super(name, surname, education, birthday);
        this.secrecy = secrecy;
        this.category = category;
        this.status = status;
    }

    public Engineer() {
    }

    public boolean getSecrecy() {
        return secrecy;
    }

    public boolean getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public void danse() {
    }
}
