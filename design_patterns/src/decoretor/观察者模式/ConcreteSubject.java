package decoretor.观察者模式;

//具体被观察对象
public class ConcreteSubject extends Subject {


    @Override
    void notifyObservers() {
        System.out.println("目标发生改变");
        System.out.println("----------");

        for (Observer observer : observers) {
            observer.response();
        }

    }
}
