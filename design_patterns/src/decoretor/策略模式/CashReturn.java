package decoretor.策略模式;

/*
满 返
 */
public class CashReturn extends CashSuper {

    private double moneyReturnCondition = 0.0d;

    private double moneyReturn = 0.0d;

    public CashReturn(double moneyReturnCondition, double moneyReturn) {
        this.moneyReturnCondition = moneyReturnCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    double acceptCash(double money) {
        return money - Math.floor(money / moneyReturnCondition) * moneyReturn;
    }
}
