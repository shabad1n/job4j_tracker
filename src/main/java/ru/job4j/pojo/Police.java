package ru.job4j.pojo;

import java.util.Date;

public class Police {

    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Kirill Gavrilov");
        license.setModel("Toyota");
        license.setCode("xx1111x");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}
