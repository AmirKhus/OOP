package Pr_1.DuckBook;

import Pr_1.DuckBook.DoubleStrategy.FustFlyAway;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyWithWings(new FustFlyAway());
        quackBehavior = new Quack();
        }

    public void display() {
    System.out.println("I’m a model duck");
    }
}
