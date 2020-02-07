package DailyWork.singleton;

public class singleton2 {
	private static  singleton2 SINGLETON;
	private singleton2(){
	}
	public static final singleton2 getInstance(){
		if(SINGLETON ==null){
			SINGLETON=new singleton2();
		}
		return SINGLETON;
	}
}
