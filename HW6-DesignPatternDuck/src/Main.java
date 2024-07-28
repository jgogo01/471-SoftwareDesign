import Controllers.DuckSimulator;
import Services.Factory.AbstractDuckFactory;
import Services.Factory.CountingDuckFactory;
import Services.Factory.DuckFactory;
import Services.Factory.DuckFactoryPolite;

public class Main {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
//        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory duckFactoryCounting = new CountingDuckFactory();
//        AbstractDuckFactory duckFactoryPolite = new DuckFactoryPolite();
//        simulator.simulate();
        simulator.simulate(duckFactoryCounting);
//        simulator.simulate(duckFactoryCounting);
//        simulator.simulate(duckFactoryPolite);
    }
}