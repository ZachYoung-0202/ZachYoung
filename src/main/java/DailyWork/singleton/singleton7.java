package DailyWork.singleton;

	public class singleton7 {
		private static final ThreadLocal<String> THREAD_LOCAL=new ThreadLocal<>();
		private singleton7(){
			
		}
		public static final String getInstance(){
	
			return THREAD_LOCAL.get();
		}
		public static final void clear(){
			THREAD_LOCAL.remove();
		}
		
}
