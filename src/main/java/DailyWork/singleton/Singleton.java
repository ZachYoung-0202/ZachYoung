package DailyWork.singleton;

public class Singleton {
	private static volatile Singleton instance = null;
	private Singleton() {//私有构造 防止外部直接new
		System.out.println("singleton is created");
	}
	private static Singleton instence=new Singleton();//类内部new一个对象
	public static Singleton getInstence() {
		return instence;
	}
}
class SingletonTest{
	public static void main(String[] args) {
		//发现只有一个输出 保证了一个类只有一个实例
		Singleton instence = Singleton.getInstence();
		Singleton instence2 = Singleton.getInstence();
		Singleton instence3 = Singleton.getInstence();
		Singleton instence4 = Singleton.getInstence();
		System.out.println(instence);
		System.out.println(instence2);
		System.out.println(instence3);
		System.out.println(instence4);
	}
}