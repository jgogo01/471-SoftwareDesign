//Natdanai Pinaves 6510405482

import models.Machine;

public class Main {
    public static void main(String[] args) {
        Machine gumballMachine = new Machine(1);
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.choose("Mango");
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();
    }
}
