package DailyWork.strategy;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class StrategyTest implements Strategy{
	@Override
	public void sayCode(int num) {
		// TODO 自动生成的方法存根
		Map <Integer,Enum> map=new HashMap<>();
		map.put(1, Code.ONE);
		map.put(2, Code.TWO);
		map.put(3, Code.THREE);
		map.put(4, Code.FOUR);
		map.put(5, Code.FIVE);
		map.put(6, Code.SIX);
		map.put(7, Code.SEVEN);
		System.out.println(map.get(num));
	}
	public static void main(String[] args) {
		Random random = new Random();
		int result = random.nextInt(7)+1;
		StrategyTest strategytest = new StrategyTest();
		strategytest.sayCode(result);

	}
}
