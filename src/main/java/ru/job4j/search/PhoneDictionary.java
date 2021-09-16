package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> compareName = name -> name.getName().contains(key);
        Predicate<Person> compareSurname = surname -> surname.getSurname().contains(key);
        Predicate<Person> comparePhone = phone -> phone.getPhone().contains(key);
        Predicate<Person> compareAdres = addres -> addres.getAddress().contains(key);
        Predicate<Person> combine = compareName.or(compareSurname.or(comparePhone)
                .or(compareAdres));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

   /* public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(key) || person.getSurname().contains(key)
                    || person.getPhone().contains(key) || person.getAddress().contains(key)) {
               result.add(person);
            }
        }
        return result;
    }*/

    public static void main(String[] args) {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Kirill", "Gavrilov", "123", "321"));
        phones.add(new Person("Kirill", "Petrov", "333", "222"));
        phones.find("Kir");
    }
}