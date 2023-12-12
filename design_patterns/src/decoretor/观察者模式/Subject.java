package decoretor.观察者模式;

import java.util.ArrayList;
import java.util.List;

//被观察的抽象类 继承该类的子类 成为被观察的对象
public abstract class Subject {

    List<Observer> observers = new ArrayList<>();

    void add(Observer observer){
        observers.add(observer);
    }

    void remove(Observer observer){
        observers.remove(observer);
    }

    //通知观察者方法
   abstract void notifyObservers();

}
