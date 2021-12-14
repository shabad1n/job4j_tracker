package ru.job4j.stream.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SummingMethod {

    public static class User {

        private String name;

        private List<Bill> bills = new ArrayList<>();

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {

        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private User user;
        private Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {
         return users.stream()
                 .map(us -> new Pair(us, new Bill(us.getBills().stream()
                         .map(Bill::getBalance)
                         .reduce(Integer::sum).get())))
                 .collect(Collectors.toMap(e -> e.user.getName(), es -> es.getBill().getBalance()));
    }

    public static Map<String, Integer> summing1(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getName,
                        Collectors.summingInt(u -> u.getBills()
                                .stream()
                                .map(Bill::getBalance).reduce(Integer::sum).get())));
    }

    public static void main(String[] args) {
        Map<Integer, Integer> result = Set.of(1, 2).stream()
                .collect(Collectors.toMap(k -> k, v -> v));
        for (Integer g : result.keySet()) {
            System.out.println(g + " " + result.get(g));
        }
    }
}