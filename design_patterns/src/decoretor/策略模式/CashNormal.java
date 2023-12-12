package decoretor.策略模式;

/*
无 优惠
 */
public class CashNormal extends CashSuper {
    @Override
    double acceptCash(double money) {
        return money;
    }
}
