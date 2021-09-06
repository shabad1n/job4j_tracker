package ru.job4j.sort.task;

//Задача написать два метода, которые сравнивают два числа, первый сравнивает в прямом порядке, второй в обратном порядке.
//        Т.е. первый должен быть аналогичен Integer.compare(), а второй должен возвращать обратный ему результат.

public class CompareMethod {
    public static int ascendingCompare(int first, int second) {
        return first - second;
    }

    public static int descendingCompare(int first, int second) {
        return second - first;
    }

}
