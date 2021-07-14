package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item itemone = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = itemone.getCreated().format(formatter);
         System.out.println(currentDateTimeFormat);
         Item itemtwo = new Item();
         System.out.println(itemtwo);
    }
}
