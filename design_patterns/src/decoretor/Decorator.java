package decoretor;

public abstract class Decorator extends FastFood  {

    FastFood fastFood;

    Decorator(FastFood fastFood,float price,String desc){
        this.fastFood = fastFood;
        setPrice(price);
        setDesc(desc);
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
