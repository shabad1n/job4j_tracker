package ru.job4j.search;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Kirill", "Gavrilov", "534872", "Msk")
        );
        ArrayList<Person> persons = phones.find("Gavr");
        assertThat(persons.get(0).getSurname(), is("Gavrilov"));
    }

    @Test
    public void whinEmptyList() {
        PhoneDictionary phones = new PhoneDictionary();
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.size(), is(0));
    }
}