package DailyWork.agent;
public class Original {
    public void world() {
        System.out.println("world");
    }
    public static void main(String[] args) {
        // 请用代理模式完成作业
        // 需要输出两行，一行hello，一行world
        Original original = new Original();
        HelloWorld helloworld = new HelloWorld(original);
    }

}
class HelloWorld {
    public HelloWorld(Original original) {
        // TODO 自动生成的构造函数存根
        System.out.println("hello");
        original.world();
    }
}
