package DailyWork.singleton;

public class singleton4 {
	private static  singleton4 SINGLETON;
	private singleton4(){
		
	}
	public  static final singleton4 getInstance(){
		if(SINGLETON==null){
		synchronized(singleton4.class){
		if(SINGLETON ==null){
			SINGLETON=new singleton4();
		}
		}
		}
		return SINGLETON;
	}
}
