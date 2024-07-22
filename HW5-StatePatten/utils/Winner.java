package utils;

import models.Machine;

public class Winner implements State {
    Machine machine;

    public Winner(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Error: Invalid State choose.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Error: Invalid State choose.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Error: Invalid State choose.");
    }

    @Override
    public void dispense() {
        this.machine.dispenseGumball();
        System.out.println("Dispensed (Winner) "+ machine.getFlavor() +" Gumball Complete.");
        if(this.machine.getGumballs() == 0){
            this.machine.setState(machine.getOutOfGumballs());
        }else {
            this.machine.dispenseGumball();
            if(this.machine.getGumballs() == 0){
                this.machine.setState(machine.getOutOfGumballs());
            }else{
                this.machine.setState(machine.getNoQuarter());
            }
        }
    }

    @Override
    public void choose(String s) {
        System.out.println("Error: Invalid State choose.");
    }
}
