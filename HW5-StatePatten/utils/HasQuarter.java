package utils;

import models.Machine;

import java.util.Random;

public class HasQuarter implements State {
    Machine machine;

    public HasQuarter(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Error: You can't insert a quarter because has quarter");
    }

    @Override
    public void ejectQuarter() {
        this.machine.setState(machine.getNoQuarter());
    }

    @Override
    public void turnCrank() {
        System.out.println("You have to choose the flavor first.");
    }

    @Override
    public void dispense() {
        System.out.println("Error: Please turn crack before dispensing the machine");
    }

    @Override
    public void choose(String s) {
        this.machine.setFlavor(s);
        System.out.println("You have chosen the flavor: " + machine.getFlavor());
        this.machine.setState(machine.getChooseFlavor());
    }
}
