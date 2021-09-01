package ru.job4j.collection.set;

import java.util.HashSet;
import java.util.Set;

//Панграмма - короткий текст, который использует все буквы алфавита, по возможности не повторяя их.
//        Метод принимает строку(на английском языке). Необходимо реализовать его так,
//        чтобы метод определил является ли входящая строка панграммой. Строчные и прописные буквы являются одинаковыми символами, пробелы необходимо игнорировать.
//        Напомню, что в английском алфавите 26 букв.

public class Pangram {
    public static boolean checkString(String s) {
        Set<String> set = new HashSet<>();
       String[] str = s.split("");
        for(String rsl : str) {
            if(!rsl.equals(" ")) {
                set.add(rsl);
            }
        }
        System.out.println(set.size());
        return set.size() >= 26;
    }

    public static void main(String[] args) {
        checkString("Jackdaws love my big sphinx of quartz");
    }
}
