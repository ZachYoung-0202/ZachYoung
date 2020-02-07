package test_java.chapter10;

public class TestParent {
    public static void main(String[] args) {
        SubRoutine s = new SubRoutine();
    }
}

class Parent{
    Parent(){
        System.out.println("调用父类构造方法");
    }
}

class SubParent extends Parent {
    SubParent(){
        System.out.println("调用子类构造方法");
    }
}

class SubRoutine extends SubParent {
    SubRoutine(){
        System.out.println("调用孙类构造方法");
    }
}
