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

    public static void main(String[] args) {
        Engineer ivan = new Engineer("Ivan", "Petrov", "higher", "05.05.1995", true, true, "junior");
    }
}
