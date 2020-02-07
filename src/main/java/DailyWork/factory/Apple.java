package DailyWork.factory;
public class Apple {
	public static void main(String[] args) {
		AppleFactory factory = new AppleProduct();
		System.out.println("--------生产iphone--------");
		iphone iphonex=factory.IphoneProduct();
		iphonex.open();
		iphonex.shutdown();
		System.out.println("--------生产ipad--------");
		ipad ipadair = factory.IpadProduct();
		ipadair.open();
		ipadair.shutdown();
	}
}

