package decoretor.备忘录模式;

//发起人
public class Originator {

    //发起人的状态
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    //创建备忘录 保存发起人的状态
    public Memento createMemento(){
        return new Memento(state);
    }

    //通过备忘录恢复发起人的状态
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }

}
