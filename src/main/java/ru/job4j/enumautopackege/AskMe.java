package ru.job4j.enumautopackege;

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позже");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
            default:
                System.out.println("Некоректные данные");
        }
    }

    public static void main(String[] args) {
        EnumDemo2 en = new EnumDemo2();
        Integer o1 = 100;
        Double o2 = 10.5;
        answer(en.ask());
        answer(en.ask());
        answer(en.ask());
        answer(en.ask());
    }
}
