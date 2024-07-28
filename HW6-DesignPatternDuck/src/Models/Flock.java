package Models;

import Services.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList<Quackable> quackables = new ArrayList<Quackable>();

    public void add(Quackable quackable) {
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quackables.iterator();
        int i = 0;
        while(iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            //No 4.2
            if(i == 0){
                System.out.println("Leader:");
                quackable.quack();
                quackable.quack();
                quackable.quack();
                System.out.print("\n");
            }else{
                quackable.quack();
            }
            i++;
        }
    }
}
