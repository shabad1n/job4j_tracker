package ru.job4j.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * В данном методе мы предусматриваем, что в строке будут прописываться пункты,
 * которые нам нужно будет сравнить. Иначе сравнение таких строк пойдет по алфавиту.
 * Пример: 1. Первый пункт.
 * Сначала разделяем строку на "номер пункта" и его название.
 * Затем представляем строку в виде числа. Далее сравниваем их.
 * Чтобы уметь делить строки, стоит почитать про регулярные выражения.
 */

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String ferst, String second) {
        String[] st1 = ferst.split("\\.");
        String[] st2 = second.split("\\.");
        int a = Integer.parseInt(st1[0]);
        int b = Integer.parseInt(st2[0]);
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        Arrays.sort(input, new LexSort());
        for (String st : input) {
            System.out.println(st);
        }
    }
}
