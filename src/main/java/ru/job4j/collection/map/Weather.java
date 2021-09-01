package ru.job4j.collection.map;

import java.util.*;

//Метод принимает список объектов Info. При это эти объекты содержат два поля:
//        1. city - название города, где производились наблюдения;
//        2. rainfall - количество осадков которые выпали в этом городе за период наблюдения.
//        Необходимо реализовать метод так, чтобы в результате вернулся список объектов Info в котором будет
//        указано имя города наблюдения и общее количество осадков за период наблюдения.

public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(Info info : list) {
            if(!map.containsKey(info.getCity())) {
                map.put(info.getCity(), 0);
            }
           map.computeIfPresent(info.getCity(), (key, value) -> value + info.getRainfall());
        }
        for(String str : map.keySet()) {
            rsl.add(new Info(str, map.get(str)));
        }
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall &&
                    Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }

        @Override
        public String toString() {
            return "Info{" +
                    "city='" + city + '\'' +
                    ", rainfall=" + rainfall +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Info> list = List.of(
                new Info("Minsk", 25), new Info("Brest", 5), new Info("Grodna", 33),
                new Info("Gomel", 26), new Info("Minsk", 15), new Info("Vitebsk", 18),
                new Info("Grodna", 18), new Info("Brest", 18), new Info("Gomel", 40),
                new Info("Minsk", 55), new Info("Vitebsk", 36), new Info("Minsk", 30),
                new Info("Gomel", 15), new Info("Grodna", 15), new Info("Brest", 40)
        );
        System.out.println( editData(list));
    }
}
