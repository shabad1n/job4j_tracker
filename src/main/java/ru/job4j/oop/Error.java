package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error( boolean active,  int status,  String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printError() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error404 = new Error(false, 404, "Программа выполненна без ошибок");
        Error error400 = new Error();
        error404.printError();
        error400.printError();
    }
}
