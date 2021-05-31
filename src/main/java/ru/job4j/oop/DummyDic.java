package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String temp = "Неизвестное слово " + eng;
        return temp;
    }

    public static void main(String[] args) {
        DummyDic dumone = new DummyDic();
        String str = dumone.engToRus("DummyDic");
        System.out.println(str);
    }
}
