package test_java.chapter11;

public class NoNameClass {
    public InterfaceInner test(){
        return new InterfaceInner(){
            private int i=5;
            public int getValue(){
                return i;
            }
        };
    }
}
