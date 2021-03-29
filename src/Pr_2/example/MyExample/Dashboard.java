package Pr_2.example.MyExample;

public class Dashboard  implements Observer{
    private Notifier notifier;
    private int speed;      // скорость
    private int rpm;        // обороты двигателя
    private int oilPressure;    // давление масла

    public Dashboard(Notifier notifier){
        this.notifier = notifier;
        notifier.addObserver(this); // регистрируем приборную панель в качестве наблюдателя
    }

    public void update(int speed, int rpm, int oilPressure) {
        this.speed = speed;
        this.rpm = rpm;
        this.oilPressure = oilPressure;
        show();
    }

    // отображение на приборной панели информации
    public void show(){
        System.out.println("Speed = " + speed + ", RPM = " + rpm +
                ", Oil pressure = " + oilPressure);
    }


}
