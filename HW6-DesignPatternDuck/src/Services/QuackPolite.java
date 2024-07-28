package Services;

public class QuackPolite implements Quackable{
    Quackable quack;

    public QuackPolite(Quackable quack) {
        this.quack = quack;
    }

    @Override
    public void quack() {
        quack.quack();
        System.out.println("Krub");
    }
}
