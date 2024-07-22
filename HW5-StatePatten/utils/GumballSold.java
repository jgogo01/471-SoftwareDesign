package utils;

import models.Machine;

public class GumballSold implements State{
    Machine machine;

    public GumballSold(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Error: Invalid Selected method in GumballSold State.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Error: Invalid Selected method in GumballSold State.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Error: Invalid Selected method in GumballSold State.");
    }

    @Override
    public void dispense() {
        this.machine.dispenseGumball();
        System.out.println("Dispensed "+ machine.getFlavor() +" Gumball Complete.");
        if(this.machine.getGumballs() == 0){
            this.machine.setState(machine.getOutOfGumballs());
        }else {
            this.machine.setState(machine.getNoQuarter());
        }
    }

    @Override
    public void choose(String s) {
        System.out.println("Error: Invalid Selected method in GumballSold State.");
    }
}
