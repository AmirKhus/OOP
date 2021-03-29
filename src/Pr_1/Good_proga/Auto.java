package Pr_1.Good_proga;

import Pr_1.Good_proga.DoublStrategy.DoubleFillStrategy;
import Pr_1.Good_proga.FIrstStrategy.FillStrategy;

public class Auto {

    FillStrategy fillStrategy;


    public void fill() {
        fillStrategy.fill();
    }



    public static void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

}