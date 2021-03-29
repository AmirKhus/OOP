package Pr_1.DuckBook;

import Pr_1.DuckBook.DoubleStrategy.DubleFly;

public class FlyWithWings implements FlyBehavior {
    DubleFly dubleFly;

    public void dubleFly() {
        dubleFly.dubleFly();
    }

    public FlyWithWings(DubleFly dubleFly) {
        this.dubleFly = dubleFly;
    }



    public void fly() { System.out.println("I’m flying!!");
} }