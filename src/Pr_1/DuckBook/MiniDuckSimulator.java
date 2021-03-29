package Pr_1.DuckBook;

import Pr_1.DuckBook.DoubleStrategy.FustFlyAway;
import Pr_1.DuckBook.DoubleStrategy.SlowFlyAway;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        FlyWithWings mallardDuck = new FlyWithWings(new SlowFlyAway());

        mallardDuck.fly();
        mallardDuck.dubleFly();



//        mallard.performQuack();
//        mallard.performFly();
//
//        Duck model = new ModelDuck();
//        model.performFly();
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();
    }
}

