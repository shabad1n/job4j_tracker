package ru.job4j.stream.task;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AveragingMethod {

    public static class Company {

        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public static class Worker {

        private int age;

        private Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public int getAge() {
            return age;
        }

        public Company getCompany() {
            return company;
        }
    }

    public static Map<String, Double> averaging(List<Worker> workers) {
        return workers.stream().collect(Collectors.groupingBy(name -> name.getCompany().getName(),
                Collectors.averagingDouble(Worker::getAge)));
    }

    public static void main(String[] args) {
    }
}
