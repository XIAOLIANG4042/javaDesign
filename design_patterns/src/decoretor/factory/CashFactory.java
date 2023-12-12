package decoretor.factory;

public class CashFactory {

    public static final String NORMAL = "正常收费";
    public static final String CASH_REBATE = "打折";
    public static final String CASH_RETURN = "满返";

    public static CashSuper createCashAdapter(String type){

        CashSuper cashSuper = switch (type) {
            case CASH_REBATE -> new CashRebate(0.8);
            case NORMAL -> new CashNormal();
            case CASH_RETURN -> new CashReturn(300, 20);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };

        return cashSuper;

    }

}
