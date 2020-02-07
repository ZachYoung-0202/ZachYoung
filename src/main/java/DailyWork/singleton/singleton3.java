package DailyWork.singleton;

public class singleton3 {
	private static  singleton3 SINGLETON;
	private singleton3(){
		
	}
	public  static final singleton3 getInstance(){
		synchronized(singleton3.class){
		if(SINGLETON ==null){
			SINGLETON=new singleton3();
		}
		}
		return SINGLETON;
	}
}

