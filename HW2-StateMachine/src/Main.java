//Natdanai Pinaves 6510405482
import models.Machine;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.addGumballs(2);
        System.out.println(machine.getGumballs());
        machine.buyGumball();
        System.out.println(machine.getGumballs());
        machine.insertQuarter();
        machine.ejectQuarter();
        machine.buyGumball();
        System.out.println(machine.getGumballs());
        machine.buyGumball();
        System.out.println(machine.getGumballs());
        machine.insertQuarter();
        machine.buyGumball();
        System.out.println(machine.getGumballs());
        machine.insertQuarter();
        machine.buyGumball();
        System.out.println(machine.getGumballs());
        machine.insertQuarter();
        machine.buyGumball();
        System.out.println(machine.getGumballs());
    }
}
