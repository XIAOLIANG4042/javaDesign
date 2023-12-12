package decoretor.策略模式;

/*
折扣
 */
public class CashRebate extends CashSuper {

    private double rebate;

    public CashRebate(double rabate) {
        this.rebate = rabate;
    }

    @Override
    double acceptCash(double money) {
        return money*rebate;
    }
}
