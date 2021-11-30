package ru.job4j.lambda.task.linklambda;

public class MyIntPredicate {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }

    public static void main(String[] args) {
        double rsl = 0;
        double com = 0;
        double[] array;
        array = new double[10];
        for (int i = 0; i < array.length; i++) {
            rsl += i;
            com = rsl / array.length;
            System.out.println(rsl + " " + com);
        }
    }
}
