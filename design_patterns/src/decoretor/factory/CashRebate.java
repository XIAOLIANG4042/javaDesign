package decoretor.factory;

/*
折扣
 */
public class CashRebate extends CashSuper{

    private double rebate;

    public CashRebate(double rabate) {
        this.rebate = rabate;
    }

    @Override
    public double acceptCash(double money) {
        return money*rebate;
    }
}
