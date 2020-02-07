package DailyWork.constructor;
public class Worker extends Builder {

    private Product product;

    public Worker() {
        product = new Product();
    }


    @Override
    Builder builderA(String arg1) {
        product.setArg1(arg1);
        return this;
    }

    @Override
    Builder builderB(int arg2) {
        product.setArg2(arg2);
        return this;
    }

    @Override
    Builder builderC(boolean arg3) {
        product.setArg3(arg3);
        return this;
    }

    @Override
    Builder builderD(short arg4) {
        product.setArg4(arg4);
        return this;
    }

    @Override
    Builder builderE(long arg5) {
        product.setArg5(arg5);
        return this;
    }

    @Override
    Builder builderF(float arg6) {
        product.setArg6(arg6);
        return this;
    }

    @Override
    Builder builderG(double arg7) {
        product.setArg7(arg7);
        return this;
    }

    @Override
    Builder builderH(char arg8) {
        product.setArg8(arg8);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
