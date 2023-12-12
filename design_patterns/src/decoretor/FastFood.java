package decoretor;

public abstract class FastFood {

   private float price;

    private String desc;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 计算价格
     * @return 返回快餐价格
     */
    abstract float cost();

}
