package ru.job4j.collection.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RemoveElements {
    public static Map<Integer, String> removeElement(Map<Integer, String> data,
                                                     List<Integer> ids,
                                                     List<User> users) {
        for (Integer id : ids) {
            if (data.containsKey(id)) {
                data.remove(id);
            }
        }
        for (User user : users) {
            if (data.containsKey(user.getId())) {
                data.remove(user.getId(), user.getName());
            }
        }
        return data;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
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
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
