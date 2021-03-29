package Pr_1.DuckBook;

import Pr_1.DuckBook.DoubleStrategy.FustFlyAway;

public class MallardDuck extends Duck {
    public MallardDuck(Quack quack, FlyWithWings flyWithWings, FustFlyAway fustFlyAway) {
        quackBehavior = quack;
        flyBehavior = flyWithWings;
        dubleFly = fustFlyAway;
    }
    public void display() {
    System.out.println("I’m a real Mallard duck");
    }
}