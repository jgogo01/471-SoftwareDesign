package Services.Factory;

import Models.DuckCall;
import Models.MallardDuck;
import Models.RedheadDuck;
import Models.RubberDuck;
import Services.QuackPolite;
import Services.Quackable;

public class DuckFactoryPolite extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackPolite(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackPolite(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackPolite(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackPolite(new RubberDuck());
    }
}
