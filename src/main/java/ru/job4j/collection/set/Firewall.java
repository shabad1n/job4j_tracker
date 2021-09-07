package ru.job4j.collection.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String rsl = "Вы сделали правильный выбор!";
        for (String str : words) {
            if (s.contains(str)) {
                rsl = "Выберите другую статью...";
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Криштиану Роналду опубликовал новую фотографию с детьми в instagram";
        System.out.println(checkName(s, words));
    }
}
