package ru.job4j.professions;

public class Doctor extends Profession {

    private int hospitalNumber;
    private int branchNumber;
    private boolean personalСabinet;
    private String specialization;
    private String status;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setHospitalNumber(int hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public int getHospitalNumber() {
        return hospitalNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setPersonalСabinet(boolean personalСabinet) {
        this.personalСabinet = personalСabinet;
    }

    public boolean getPersonalCabine() {
        return personalСabinet;
    }
}
