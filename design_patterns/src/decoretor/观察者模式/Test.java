package decoretor.观察者模式;

public class Test {

    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();
        concreteSubject.add(concreteObserver1);
        concreteSubject.add(concreteObserver2);

        concreteSubject.notifyObservers();

    }
}
