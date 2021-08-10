package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if(person.toString().contains(key)) {
               result.add(person);
            }
        }
        for (Person rsl : result) {
            System.out.println(rsl);
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Kirill", "Gavrilov", "123", "321"));
        phones.add(new Person("Kirill", "Petrov", "333", "222"));
        phones.find("Kir");
    }
}