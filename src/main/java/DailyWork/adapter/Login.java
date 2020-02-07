package DailyWork.adapter;
public class Login {
	public interface OldLogin{
		//最原始的账号、密码登录
		void login();
	}
	public static class OldLoginImp implements OldLogin{

		@Override
		public void login() {
			// TODO 自动生成的方法存根
			System.out.println("老的登录方式");
		}
	}
	public interface NewLogin extends OldLogin{
		void facelogin();
	}
	public static class NewLoginImp extends OldLoginImp implements NewLogin{

		@Override
		public void facelogin() {
			// TODO 自动生成的方法存根
			System.out.println("人脸识别");
		}

	}
	public static void main(String[] args) {
		NewLogin newlogin = new NewLoginImp();
		newlogin.login();
		newlogin.facelogin();
	}
}
