package utils;

import models.Machine;

public class NoQuarter implements State{
    Machine machine;

    public NoQuarter(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        this.machine.setState(machine.getHasQuarter());
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Error: Machine has no quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Error: Please insert quarter before turnCrank the machine");
    }

    @Override
    public void dispense() {
        System.out.println("Error: Please insert quarter before dispensing the machine");
    }

    @Override
    public void choose(String s) {
        System.out.println("Error: Please insert quarter before choosing a flavor");
    }
}
