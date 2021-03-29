package Pr_3.My;

public class App {
    public static void main(String[] args) {
        Car simpleCar = new SimpleCar();
        System.out.println("Скорость легкового автомобиля - " + String.valueOf(simpleCar.getSpeed()));
        System.out.println("Простой автомобиля может принимать багаж весом" + String.valueOf(simpleCar.getBaggageWeight()));

        Car sportCar = new SportCar(simpleCar);

        System.out.println("Скорость спортивного автомобиля - " + String.valueOf(sportCar.getSpeed()));
        System.out.println("Спортивный автомобиль может принимать багаж весом" + String.valueOf(sportCar.getBaggageWeight()));

        Car truck = new Truck(simpleCar);

        System.out.println("Скорость грузового- " + String.valueOf(truck.getSpeed()));
        System.out.println("Грузовой может принимать багаж весом " + String.valueOf(truck.getBaggageWeight()));
    }
}