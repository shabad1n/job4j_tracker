package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student ivan = new Student();
        ivan.setFullName("Gavrilov Kirill Alexand");
        ivan.setGroup("222");
        ivan.setDateOfReceipt("12.12.2012");
        System.out.println(ivan.getFullName() + " Из группы "  + ivan.getGroup()
                + " родился " + ivan.getDateOfReceipt());
    }
}
