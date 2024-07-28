package Services.Factory;

import Models.DuckCall;
import Models.MallardDuck;
import Models.RedheadDuck;
import Models.RubberDuck;
import Services.QuackCounter;
import Services.Quackable;

public class CountingDuckFactory extends DuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    public Quackable createRedheadDuck(){
        return new QuackCounter(new RedheadDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
