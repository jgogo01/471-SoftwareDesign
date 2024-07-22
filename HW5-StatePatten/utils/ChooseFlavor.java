package utils;

import models.Machine;

import java.util.Random;

public class ChooseFlavor implements State  {
    private Machine machine;
    Random rand = new Random();

    public ChooseFlavor(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Error: Invalid State Choose.");
    }

    @Override
    public void ejectQuarter() {
        this.machine.setState(machine.getNoQuarter());
    }

    @Override
    public void turnCrank() {
        System.out.println("Your turned...");
        int randInt = rand.nextInt(10);
        if(randInt == 0) {
            this.machine.setState(machine.getWinner());
        }else{
            this.machine.setState(machine.getGumballSold());
        }
        //Auto: Call Dispense
        this.machine.getState().dispense();
    }

    @Override
    public void dispense() {
        System.out.println("Error: Invalid State Choose.");
    }

    @Override
    public void choose(String s) {
        this.machine.setFlavor(s);
        System.out.println("You have chosen the flavor: " + machine.getFlavor());
    }
}
