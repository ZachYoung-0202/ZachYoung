package DailyWork.decoration;
public class Decoration {
    public interface Dishe {
        String taste();

        double getPrice();

        String getName();
    }

    private static class Cabbage implements Dishe {
        @Override
        public String taste() {
            return "这是" + this.getName() + "的味道";
        }

        @Override
        public double getPrice() {
            return 10.0d;
        }

        @Override
        public String getName() {
            return "白菜";
        }
    }

    private static class CabbageWithVinegar extends Cabbage implements Dishe {
        @Override
        public String taste() {
            return super.taste() + "，加了盐";
        }

        @Override
        public double getPrice() {
            return super.getPrice() + 1.0d;
        }

        @Override
        public String getName() {
            return "醋" + super.getName();
        }
    }

    private static class CabbageWithVinegarAndSugar extends CabbageWithVinegar implements Dishe {
        @Override
        public String taste() {
            return super.taste() + "，加了糖，" + this.getName() + "好吃！";
        }

        @Override
        public double getPrice() {
            return super.getPrice() + 1.0d;
        }

        @Override
        public String getName() {
            return "糖" + super.getName();
        }
    }

    /**
     * 必定修改main函数的代码，至于其他地方自行思考
     */
    public static void main(String[] args) {
        //买了一颗白菜
        Dishe cabbage=new Cabbage();
        //加了点盐
        cabbage = new CabbageWithVinegar();
        //再加点糖
        cabbage=new CabbageWithVinegarAndSugar();
        //名称为糖醋白菜 价格是10+1+1=12 味道这是糖醋白菜的味道，加了盐，加了糖，糖醋白菜好吃！
        System.out.println("名称:"+cabbage.getName()+"\n"+"价格是:"+cabbage.getPrice()+"\n"+"味道:"+"\n"+cabbage.taste());
    }
}
