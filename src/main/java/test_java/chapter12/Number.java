package test_java.chapter12;

public class Number {
    private double result;
    private double x;
    private double y;
    public Number(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double count(){
        result=x*y;
        return result;
    }

    public static void main(String[] args) {
        Number number = new Number(11,12);
        double num = 0;
        try{
          num=number.count();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println(num);
        }
        
    }
}
