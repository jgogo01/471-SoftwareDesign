package Services;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuack() {
        return numberOfQuacks;
    }
}
