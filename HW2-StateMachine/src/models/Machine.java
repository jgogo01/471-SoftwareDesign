//Natdanai Pinaves 6510405482
package models;

public class Machine {
    private int gumballs;
    private boolean hasQuarter;
    private boolean ready;

    public Machine() {
        this.gumballs = 0;
        this.ready = false;
        this.hasQuarter = false;
    }

    public void insertQuarter() {
        this.hasQuarter = true;
    }

    public void ejectQuarter() {
        this.hasQuarter = false;
    }

    public void buyGumball(){
        if(this.hasQuarter){
            if(this.ready){
                this.hasQuarter = false;
                this.gumballs--;
                if(this.gumballs == 0){
                    this.ready = false;
                }
            }
        }
    }

    public void addGumballs(int gumballs){
        if(gumballs > 0){
            this.gumballs += gumballs;
            this.ready = true;
        }
    }

    public int getGumballs(){
        return this.gumballs;
    }
}
