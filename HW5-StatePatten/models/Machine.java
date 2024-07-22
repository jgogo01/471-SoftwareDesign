//Natdanai Pinaves 6510405482
package models;

import utils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Machine {
    private int gumballs;
    private String flavor;
    State state;
    State gumballSold;
    State hasQuarter;
    State noQuarter;
    State outOfGumballs;
    State winner;
    State chooseFlavor;

    public Machine(int gumballs) {
        this.gumballs = gumballs;
        noQuarter = new NoQuarter(this);
        gumballSold = new GumballSold(this);
        hasQuarter = new HasQuarter(this);
        outOfGumballs = new OutOfGumballs(this);
        winner = new Winner(this);
        chooseFlavor = new ChooseFlavor(this);

        //Init
        state = noQuarter;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
    }

    public void choose(String s){
        state.choose(s);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor(){
        return flavor;
    }

    public State getState(){
        return state;
    }

    public State getWinner() {
        return winner;
    }

    public State getOutOfGumballs() {
        return outOfGumballs;
    }

    public State getNoQuarter() {
        return noQuarter;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public State getGumballSold() {
        return gumballSold;
    }

    public State getChooseFlavor() {
        return chooseFlavor;
    }

    public void dispenseGumball() {
        gumballs--;
    }

    public int getGumballs() {
        return gumballs;
    }
}
