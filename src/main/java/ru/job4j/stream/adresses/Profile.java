package ru.job4j.stream.adresses;

public class Profile {
    private Address address;

    Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
