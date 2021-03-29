package Pr_1.Good_proga;

import Pr_1.Good_proga.DoublStrategy.FustElectricCharcgStrategy;
import Pr_1.Good_proga.FIrstStrategy.batteriesFillStrategy;

public class Main {

    public static void main(String[] args) {

        Auto electicCar = new ElectricCar( new batteriesFillStrategy());
        ElectricCar electricCar = new FustZarydka(new FustElectricCharcgStrategy());


        electicCar.fill();
        electricCar.doubleFillStrategy();


//        Auto sedan = new Sedan(new StandartFillStrategy());
//        sedan.fill();
//
//        Auto hybridAuto = new HybridAuto(new batteriesFillStrategy());
//        hybridAuto.fill();
//
//
//        Auto f1car = new F1Car(new F1PitstopStrategy());
//        f1car.fill();
    }
}
