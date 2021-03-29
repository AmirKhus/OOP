package Pr_3.My.abstrClass;

class AirCondition extends Decorator{
    Car car;

    public AirCondition(Car car){
        this.car = car;
    }

    public String getInfo() {
        return car.getInfo() + " + Air Conditioning";
    }

    public int getPrice() {
        return car.getPrice() + 1000;
    }
}
