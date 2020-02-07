package DailyWork.constructor;

public class Test {
    public static void main(String[] args) {

        Builder worker = new Worker();
        //如果用户不改变数据 就使用默认数据
        Product product=worker.getProduct();
        System.out.println(product.toString());
        //用户通过worker改变数据
        Product product1=worker.builderA("java").getProduct();
        System.out.println(product1.toString());
    }
}
