package ru.job4j.oop;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "{" + "\n" + name + ": name," + "\n" + body + ": body" + "\n" + "}";
    }

    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        System.out.println(report.generate("Report's name", "Report's body" ));
    }
}
