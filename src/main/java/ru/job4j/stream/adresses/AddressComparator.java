package ru.job4j.stream.adresses;

import java.util.Comparator;

public class AddressComparator implements Comparator<Address> {

    @Override
    public int compare(Address a1, Address a2) {
        return a1.getCity().compareTo(a2.getCity());
    }
}
