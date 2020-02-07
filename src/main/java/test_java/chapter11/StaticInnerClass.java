package test_java.chapter11;

public class StaticInnerClass {
    int x=100;
    static class Inner{
        void doitInner(){
            System.out.println("haha");
        }

        public static void main(String[] args) {
            Inner inner = new Inner();
            inner.doitInner();
            System.out.println("aaaaaaa");
        }
    }
}
