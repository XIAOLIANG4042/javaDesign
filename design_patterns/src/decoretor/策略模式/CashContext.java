package decoretor.策略模式;

public class CashContext {

    private CashSuper cs;

    public CashContext(String inputText){
        this.cs = switch (inputText){
            case "正常收费" -> new CashNormal();
            case "满减" -> new CashReturn(300,100);
            default -> throw new IllegalStateException("Unexpected value: " + inputText);
        };
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }

}
