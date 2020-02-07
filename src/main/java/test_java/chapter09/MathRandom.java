package test_java.chapter09;

public class MathRandom {
    public static int GetEvenNum(double num1,double num2){

        //产生num1~num2之间的数
        int s= (int) (num1+Math.random()*(num2-num1));
        if(s%2==0){
            return s;
        }
        else{
            return s+1;
        }
    }

    public static void main(String[] args) {
        System.out.println("产生2-30之间的偶数:"+GetEvenNum(2,30));
    }
}
