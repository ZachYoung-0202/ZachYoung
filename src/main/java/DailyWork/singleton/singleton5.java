package DailyWork.singleton;

public class singleton5 {
	
	private static class Holder{
		private static  final singleton5 SINGLETON=new singleton5();
	}
	private singleton5(){
		
	}
	public  static final singleton5 getInstance(){
		return Holder.SINGLETON;
	}	
}

