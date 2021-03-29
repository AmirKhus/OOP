package Pr_1.Good_proga;

import Pr_1.Good_proga.DoublStrategy.DoubleFillStrategy;
import Pr_1.Good_proga.FIrstStrategy.batteriesFillStrategy;

public class ElectricCar extends Auto {
    DoubleFillStrategy doubleFillStrategy;

//    public ElectricCar() {
//        this.fillStrategy = new batteriesFillStrategy();
//    }

    public void doubleFillStrategy(){
        doubleFillStrategy.DoubleFillStrategy();
    }

    public ElectricCar(batteriesFillStrategy batteriesFillStrategy) {
        this.fillStrategy = batteriesFillStrategy;
    }

    public ElectricCar() {
    }

    public void setDoubleFillStrategy(DoubleFillStrategy doubleFillStrategy) {
        this.doubleFillStrategy = doubleFillStrategy;
    }

}
