package DailyWork.constructor;

    public abstract class Builder {
        abstract Builder builderA(String arg1);
        abstract Builder builderB(int arg2);
        abstract Builder builderC(boolean arg3);
        abstract Builder builderD(short arg4);
        abstract Builder builderE(long arg5);
        abstract Builder builderF(float arg6);
        abstract Builder builderG(double arg7);
        abstract Builder builderH(char arg8);
        abstract Product getProduct();
    }
