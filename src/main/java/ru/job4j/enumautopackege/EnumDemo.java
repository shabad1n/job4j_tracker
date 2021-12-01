package ru.job4j.enumautopackege;

public class EnumDemo {
    public static void main(String[] args) {

          Apple ap = Apple.Jonathan;
          System.out.println(ap.getPrice());

    }

    enum Apple {
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
