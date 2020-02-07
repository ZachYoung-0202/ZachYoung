package DailyWork.framework;
public abstract class Cook {
	public final void cook() {//用final类型固定整个cook的框架 确定炒菜的步骤
		buy();
		wash();
		cut();
		fry();
	}
	public void buy() {//买菜洗菜切菜步骤都一样 咋子这里视为一样
		System.out.println("买菜");
	}
	public void wash() {
		System.out.println("洗菜");
	}
	public void cut() {
		System.out.println("切菜");
	}
	public abstract void fry();//不同的厨师炒菜
}
