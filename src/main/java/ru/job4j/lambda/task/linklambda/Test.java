package ru.job4j.lambda.task.linklambda;

public class Test {
    private int a;

    Test(int i) {
        a = i;
    }

    public static void swap(Test test1, Test test2) {
        int com = test1.a;
        test1.a = test2.a;
        test2.a = com;
    }
}
