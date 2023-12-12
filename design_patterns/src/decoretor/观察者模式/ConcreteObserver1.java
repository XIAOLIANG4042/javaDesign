package decoretor.观察者模式;

public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("观察者1 做出反应");
    }
}
