package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for(Account user : accounts) {
            rsl.add(user);
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Kirill Gavrilov", "qwe1234f"),
                new Account("123", "Kirill Gavrilov", "000001")
        );
        System.out.println(sent(accounts));
    }
}
