package ru.job4j.stream.adresses;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> getAddresses = profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
        return getAddresses;
    }
}
