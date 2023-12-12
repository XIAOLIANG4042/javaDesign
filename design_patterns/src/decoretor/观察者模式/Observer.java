package decoretor.观察者模式;
// 观察者 抽象接口 ,实现该接口成为观察者
//将观察者注入到 被观察对象中
public interface Observer {

    //被观察者调用的方法
    void response();

}
