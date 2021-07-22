package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if(users[i].equals(login)) {
                rsl = null;
                break;
            }
        }
        throw new UserNotFoundException();
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Kirill Gavrilov", true),
                new User("Ivan Ivanov", false)
        };
        User user = findUser(users, "Kirill Gavrilov");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
