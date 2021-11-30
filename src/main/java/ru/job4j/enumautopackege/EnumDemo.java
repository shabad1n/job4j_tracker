package ru.job4j.enumautopackege;

public class EnumDemo {
    public static void main(String[] args) {
//        Создается переменная типа Apple, при создании переменной типа Apple
//        создается объект перечисления enum
          Apple ap = Apple.Jonathan;
          System.out.println(ap.getPrice());
//        Создается сыллка типа Apple(массив) и заполняется методом values
//        который перечисляет все константы класса Apple
//        Apple[] goodApple = Apple.values();
//        System.out.println(goodApple.length);

    }

    enum Apple {
        //Создается список enum(Тип класса)
        Jonathan(70), GoldenDel(65), RedDel(65), Winesap(50), Cortland(120);

        private int price;

        Apple(int p) {
            this.price = p;
        }

        public int getPrice() {
            return price;
        }
    }
}
