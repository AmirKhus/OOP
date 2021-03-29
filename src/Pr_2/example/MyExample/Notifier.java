package Pr_2.example.MyExample;

interface Notifier {
    void addObserver(Observer obs); //добавление наблюдателя

    void removeObserver(Observer obs);//удаление наблюдателя

    void notifyObserver();//оповещение наблюдателей
}

