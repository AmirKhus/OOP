package Pr_1.Good_proga.FIrstStrategy;

import Pr_1.Good_proga.DoublStrategy.DoubleFillStrategy;

public class batteriesFillStrategy implements FillStrategy {
    DoubleFillStrategy doubleFillStrategy;


    public void doubleFillStrategy() {
        doubleFillStrategy.DoubleFillStrategy();
    }

    public void setDoubleFillStrategy(DoubleFillStrategy doubleFillStrategy) {
        this.doubleFillStrategy = doubleFillStrategy;
    }
        @Override
        public void fill() {
            System.out.println("Зарядите батарейки!");
        }
}
