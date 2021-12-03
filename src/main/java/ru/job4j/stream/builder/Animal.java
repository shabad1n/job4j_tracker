package ru.job4j.stream.builder;

public class Animal {

    private String name;
    private int age;
    private String type;
    private Double weight;
    private Double height;
    private int liveAverage;

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\''
                + ", age=" + age
                + ", type='" + type
                + '\'' + ", weight="
                + weight + ", height="
                + height + ", liveAverage="
                + liveAverage + '}';
    }

    public static class Builder {

        private String name;
        private int age;
        private String type;
        private Double weight;
        private Double height;
        private int liveAverage;

        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        public Builder buildAge(int age) {
            this.age = age;
            return this;
        }

        public Builder buildType(String type) {
            this.type = type;
            return this;
        }

        public Builder buildWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        public Builder buildHeight(Double height) {
            this.height = height;
            return this;
        }

        public Builder buildLiveAverage(int liveAverage) {
            this.liveAverage = liveAverage;
            return this;
        }

        Animal build() {
            Animal animal = new Animal();
            animal.name = name;
            animal.age = age;
            animal.type = type;
            animal.weight = weight;
            animal.height = height;
            animal.liveAverage = liveAverage;
        }
    }
}
