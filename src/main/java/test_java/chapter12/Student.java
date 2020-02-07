package test_java.chapter12;

public class Student {
    public void speak(int m) throws MyException {
        if(m>1000){
            throw new MyException();
        }
    }

    public static void main(String[] args){
        Student student = new Student();
        try{
            student.speak(1001);
        }catch(MyException e){
            e.print();
        }

    }
}
