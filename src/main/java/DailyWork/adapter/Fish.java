package DailyWork.adapter;

public class Fish extends adaptee implements Animal {

	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("大鱼吃小鱼，小鱼吃虾米，虾米吃......吃水!?");
	}
	public void run() {
		super.run();
	}
	@Override
	public void breathe() {
		// TODO 自动生成的方法存根
		System.out.println("吐泡泡呼吸法");
	}

}
