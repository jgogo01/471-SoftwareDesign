package utils;

import models.Machine;

public class OutOfGumballs implements State {
    Machine machine;

    public OutOfGumballs(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Error: Out of gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Error: Out of gumballs");
    }

    @Override
    public void turnCrank() {
        System.out.println("Error: Out of gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("Error: Out of gumballs");
    }

    @Override
    public void choose(String s) {
        System.out.println("Error: Out of gumballs");
    }
}
