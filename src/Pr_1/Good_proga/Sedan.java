package Pr_1.Good_proga;

import Pr_1.Good_proga.DoublStrategy.view95BenzinStrategy;
import Pr_1.Good_proga.FIrstStrategy.StandartFillStrategy;

public class Sedan extends Auto {

    public Sedan(StandartFillStrategy standartFillStrategy) {
        this.fillStrategy = standartFillStrategy;
    }
    public Sedan(StandartFillStrategy standartFillStrategy, view95BenzinStrategy view95BenzinStrategy) {
        this.fillStrategy = standartFillStrategy;
    }

}