package ru.job4j.professions;

public class Engineer extends Profession {

    private boolean secrecy;
    private boolean category;
    private String status;

    public void setSecrecy(boolean secrecy) {
        this.secrecy = secrecy;
    }

    public boolean getSecrecy() {
        return secrecy;
    }

    public void setCategory(boolean category) {
        this.category = category;
    }

    public boolean getCategory() {
        return category;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void danse() {
    }
}
