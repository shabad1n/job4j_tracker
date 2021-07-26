package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                rsl = users[i];
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if (user.isValid() != false && user.getUsername().length() > 3) {
            rsl = true;
        }
        if (rsl == false) {
            throw new UserInvalidException("Пользователь не валидный");
        }
        return rsl;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Kirill Gavrilov", true),
                new User("Ivan Ivanov", false),
        };
        try {
            User user = findUser(users, "Kirill Gavrilov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
