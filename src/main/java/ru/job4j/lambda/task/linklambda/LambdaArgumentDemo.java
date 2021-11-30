package ru.job4j.lambda.task.linklambda;

public class LambdaArgumentDemo {
    public static void main(String[] args) {
        StringFunc stringFunc = str -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        };
        System.out.println(stringFunc.func("Привет мир"));
    }
}
