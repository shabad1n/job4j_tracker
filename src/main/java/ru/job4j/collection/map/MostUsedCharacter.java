package ru.job4j.collection.map;

import java.util.Map;
import java.util.TreeMap;

// Метод принимает строку, которая может содержать несколько пробелов,
// однако в ней отсутствуют знаки препинания.
// Необходимо реализовать метод, который вернет символ в строке,
// который употребляется наибольшее количество раз.
// Если окажется что таких символов несколько - необходимо вернуть первый из символов.
// Чтобы обеспечить сортировку символов -
// собирайте исходную строку в TreeMap(), в которой ключ - это символ,
// значение - количество. Перед тем как собирать строку ее нужно привести к нижнему регистру,
// удалить пробелы.
// Для того, чтобы собрать строку в отображение используйте методы computeIfPresent()
// и putIfAbsent()  - первый обновит значение частотности употребления символа,
// второй - вставит пару ключ(символ) значение(1) - если такого символа в отображении еще нет.

public class MostUsedCharacter {

    public static char getMaxCount(String str) {
        Map<Character, Integer> map = new TreeMap();
        str = str.toLowerCase();
        str = str.replaceAll("\\s+", "");
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.computeIfAbsent(str.charAt(i), value -> 1);
            } else {
                map.computeIfPresent(str.charAt(i), (key, value) -> value + 1);
            }
        }
        System.out.println(map);
        int temp = 0;
        char rsl = ' ';
        for (Character ch : map.keySet()) {
            if (map.get(ch) > temp) {
                temp = map.get(ch);
                rsl = ch;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String ln = System.lineSeparator();
        String str = "Мой дядя самых честных правил "
                + "Когда не в шутку занемог "
                + "Он уважать себя заставил "
                + "И лучше выдумать не мог "
                + "Его пример другим наука "
                + "Но боже мой какая скука "
                + "С больным сидеть и день и ночь "
                + "Не отходя ни шагу прочь "
                + "Какое низкое коварство "
                + "Полуживого забавлять "
                + "Ему подушки поправлять "
                + "Печально подносить лекарство "
                + "Вздыхать и думать про себя "
                + "Когда же черт возьмет тебя";
        getMaxCount(str);
    }
}
