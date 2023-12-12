package decoretor.备忘录模式;

//备忘录 存储发起人的状态
//备忘录的定义  在不破坏对象封装的前提现 去捕捉对象的内部状态 并将状态保存在对象之外 ,在需要的时候将对象恢复
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
