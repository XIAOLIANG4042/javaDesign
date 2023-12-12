package decoretor.factory;

/*
无 优惠
 */
public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
