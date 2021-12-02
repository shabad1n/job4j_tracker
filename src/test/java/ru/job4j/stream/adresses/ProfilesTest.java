package ru.job4j.stream.adresses;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.adresses.Address;
import ru.job4j.stream.adresses.Profile;
import ru.job4j.stream.adresses.Profiles;

import java.util.List;

import static org.hamcrest.Matchers.is;

public class ProfilesTest {

    @Test
    public void getAlistOfAddress() {
        Address msk = new Address("Moscow", "Pobeda", 15, 25);
        Address spb = new Address("Spb", "Pobeda", 12, 13);
        Profiles profiles = new Profiles();
        List<Profile> pr = List.of(
                new Profile(msk),
                new Profile(spb)
        );
        List<Address> result = profiles.collect(pr);
        List<Address> expected = List.of(
                new Address("Moscow", "Pobeda", 15, 25),
                new Address("Spb", "Pobeda", 12, 13)
        );
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void getASortedListAddress() {
        Address msk = new Address("Moscow", "Pobeda", 15, 25);
        Address spb = new Address("Spb", "Pobeda", 12, 13);
        Address msk1 = new Address("Moscow", "Pobeda", 15, 25);
        Address spb1 = new Address("Spb", "Pobeda", 12, 13);
        Profiles profiles = new Profiles();
        List<Profile> pr = List.of(
                new Profile(msk),
                new Profile(spb)
        );
        List<Address> result = profiles.collectSorted(pr);
        List<Address> expected = List.of(
                new Address("Moscow", "Pobeda", 15, 25),
                new Address("Spb", "Pobeda", 12, 13)
        );
        Assert.assertThat(result, is(expected));
    }
}