package decoretor.观察者模式;

public class ConcreteObserver2 implements Observer{
    @Override
    public void response() {
        System.out.println("观察者2 做出反应");
    }
}
