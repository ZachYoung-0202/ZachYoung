package DailyWork.strategy;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author your name
 * 开放性问题，所有你认为好的写法都可以写出来，并且说明你的思路。
 * 提示：1.interface;2.map
 * @date 2020/1/20
 */
public class Test {

    private enum Code {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN
    }

    public interface Strategy {
        void sayCode();
    }

    private static class Strategy1 implements Strategy {
        @Override
        public void sayCode() {
            System.out.println(Code.ONE);
        }
    }

    private static class Strategy2 implements Strategy {
        @Override
        public void sayCode() {
            System.out.println(Code.TWO);
        }
    }

    private static class Strategy3 implements Strategy {
        @Override
        public void sayCode() {
            System.out.println(Code.THREE);
        }
    }

    private static class Strategy4 implements Strategy {
        @Override
        public void sayCode() {
            System.out.println(Code.FOUR);
        }
    }

    private static class Strategy5 implements Strategy {
        @Override
        public void sayCode() {
            System.out.println(Code.FIVE);
        }
    }

    private static class Strategy6 implements Strategy {
        @Override
        public void sayCode() {
            System.out.println(Code.SIX);
        }
    }

    private static class Strategy7 implements Strategy {
        @Override
        public void sayCode() {
            System.out.println(Code.SEVEN);
        }
    }

    /**
     * 类加载好之后就初始化完成了，后续直接调用
     */
    private static final Map<Integer, Strategy> MAP = new HashMap<>();

    static {
        MAP.put(1, new Strategy1());
        MAP.put(2, new Strategy2());
        MAP.put(3, new Strategy3());
        MAP.put(4, new Strategy4());
        MAP.put(5, new Strategy5());
        MAP.put(6, new Strategy6());
        MAP.put(7, new Strategy7());
    }

    public static void main(String[] args) {
        Random random = new Random();
        //生成1~10的随机数
        int result = random.nextInt(10) + 1;
        //请用策略模式优化以下代码
        MAP.get(result).sayCode();
    }
}