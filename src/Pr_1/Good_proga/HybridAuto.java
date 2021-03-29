package Pr_1.Good_proga;

import Pr_1.Good_proga.DoublStrategy.FustElectricCharcgStrategy;
import Pr_1.Good_proga.FIrstStrategy.batteriesFillStrategy;

public class HybridAuto extends Auto {

//    public HybridAuto() {
//        this.fillStrategy = new HybridFillStrategy();
//    }


    public HybridAuto(batteriesFillStrategy batteriesFillStrategy) {
        this.fillStrategy = batteriesFillStrategy;
    }
}