package ru.job4j.stream.task;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GroupMethod {

    public static class User {

        private int age;

        private String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age
                    && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        @Override
        public String toString() {
            return "User{"
                    + "age=" + age
                    + ", name='"
                    + name + '\'' + '}';
        }
    }

    public static Map<Integer, List<User>> groupBy(List<User> users) {
         return users.stream()
                 .collect(Collectors.groupingBy(User::getAge));
    }

    public static void main(String[] args) {
        List<User> list = List.of(
                new User(25, "Кирилл"),
                new User(26, "Анастасия")
        );
        Map<Integer, List<User>> map = groupBy(list);
    }
}