package decoretor.策略模式;

public class Test {

    public static void main(String[] args) {

        //策略模式 不完美写法 没有将优惠类型 和代码解耦

//        String inputText = "满减";
//        int productNum = 100;
//        double price = 3.0d;
//        CashContext cc = switch (inputText){
//            case "正常收费" -> new CashContext(new CashNormal());
//            case "满减" -> new CashContext(new CashReturn(300,100));
//            default -> throw new IllegalStateException("Unexpected value: " + inputText);
//        };
//        double cost = cc.getResult(price*productNum);
//        System.out.println(cost);


        //修改后的写法 将优惠类型 和业务代码进行解耦
        String inputText = "满减";
        int productNum = 100;
        double price = 3.0d;
        //可以使用反射 将自动创建策略对象
        //使用spring 将策略自动注入到 上下文list属性中
        double cost = new CashContext(inputText).getResult(productNum*price);

        System.out.println(cost);





    }

}
