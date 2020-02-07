package DailyWork.appointment;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Appointment implements Appointment_Implement{
	@Override
	public Code getCode(int result) {
		Map <Integer,Enum> map = new HashMap<Integer, Enum>();
		map.put(1, Code.ONE);
		map.put(2, Code.TWO);
		map.put(3, Code.THREE);
		map.put(4, Code.FOUR);
		map.put(5, Code.FIVE);
		map.put(6, Code.SIX);
		map.put(7, Code.SEVEN);
		return (Code) map.get(result);
		// TODO 自动生成的方法存根
	}
	public static Code getResult(int result) {
		Appointment app = new Appointment();
		return app.getCode(result);
	}
	/**
	 * 要求结果：
	 * 1->Code.ONE
	 * 2->Code.TWO
	 * 3->Code.THREE
	 * ......
	 * 7->Code.SEVEN
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int result = random.nextInt(7)+1;
		System.out.println(getResult(result));
	}
}
