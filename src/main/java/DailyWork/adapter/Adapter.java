package DailyWork.adapter;
public class Adapter {
    private interface Animal {
        void eat();

        void run();

        void breathe();
    }
    public abstract class adaptee implements Animal{
        public void run() {
            System.out.println("例如我这条鱼能听懂人类语言");
        }
    }
    /**
     * Fish必须直接或者间接实现Animal接口
     */
    public  class Fish extends adaptee implements Animal {

        @Override
        public void eat() {
            System.out.println("大鱼吃小鱼，小鱼吃虾米，虾米吃......吃水!?");
        }
        public void run() {
            super.run();
        }
        @Override
        public void breathe() {
            System.out.println("吐泡泡呼吸法");
        }
    }

    /**
     * main函数的代码无需改动
     */
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Fish fish = adapter.new Fish();
        fish.eat();
        fish.run();
        fish.breathe();
    }
}
