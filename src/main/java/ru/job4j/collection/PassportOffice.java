package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }

    public static void main(String[] args) {
        Citizen citizen1 = new Citizen("2f44a", "Kirill Gavrilov");
        Citizen citizen2 = new Citizen("2f45A", "Kirill Gavrilov");
        PassportOffice passportOffice = new PassportOffice();
        passportOffice.add(citizen1);
        passportOffice.add(citizen2);
        passportOffice.get("2f44a");
    }
}