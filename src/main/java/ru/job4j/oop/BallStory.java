package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zay = new Hare();
        Wolf volk = new Wolf();
        Fox lisa = new Fox();
        zay.tryEat(kolobok);
        kolobok.run(zay);
        volk.tryEat(kolobok);
        kolobok.run(volk);
        lisa.eat(kolobok);
        kolobok.kill(lisa);
    }
}
