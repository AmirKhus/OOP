package Pr_2.example.MyExample;

import java.util.ArrayList;
import java.util.List;

class CentralComp implements Notifier {
    private List observers;    // список наблюдателей
    private int speed;      // скорость
    private int rpm;        // обороты двигателя
    private int oilPressure;    // давление масла

    public CentralComp() {
        observers = new ArrayList();
    }

    // добавить слушателя
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    // удалить слушателя
    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    // уведомить слушателей
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer obs = (Observer) observers.get(i);
            obs.update(speed, rpm, oilPressure);
        }
    }

    public void changeData(int speed, int rpm, int oilPressure) {    // метод для изменения характеристик при движении автомобиля
        this.speed = speed;
        this.rpm = rpm;
        this.oilPressure = oilPressure;
        notifyObserver();       // уведомляем слушателей об изменениях
    }

}