package Pr_1.DuckBook;

import Pr_1.DuckBook.DoubleStrategy.DubleFly;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {

    }

    public abstract void display();

    DubleFly dubleFly;
    public void dubleFly() {
        dubleFly.dubleFly();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
