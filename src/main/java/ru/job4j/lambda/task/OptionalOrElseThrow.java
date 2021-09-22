package ru.job4j.lambda.task;

import java.util.List;
import java.util.Optional;

public class OptionalOrElseThrow {

    public static class User {

        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException {
        public UserNotFoundException(String message) {
            super(message);
        }
    }

    public static User orElseThrow(List<User> list, String login) {
        // return search(list, login).orElseThrow()
         return search(list, login).orElseThrow(() -> new UserNotFoundException("Логин не существует"));
    }

    private static Optional<User> search(List<User> list, String login) {
        for (User user1 : list) {
            if (user1.getLogin().equals(login)) {
               return Optional.of(user1);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");
        System.out.println(orElseThrow(
                List.of(u1, u2, u3), "u4"
        ).getLogin());
    }
}
