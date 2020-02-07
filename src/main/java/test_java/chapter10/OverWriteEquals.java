package test_java.chapter10;

public class OverWriteEquals {
    public static void main(String[] args) {
        V v1= new V("123");
        V v2 = new V("123" );
        System.out.println(v2.str.equals(v1.str));
        System.out.println(v2== v1);//引用地址
    }
}

class V{
    public String str=null;
    V(String s){
        this.str=s;
    }
}
