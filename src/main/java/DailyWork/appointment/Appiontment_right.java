package DailyWork.appointment;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Appiontment_right {
    private static class Strategy1 implements Appointment_RightImplement {
        public String getCode() {
            return "ONE";
        }
    }
    private static class Strategy2 implements Appointment_RightImplement {
        public String getCode() {
            return "TWO";
        }
    }
    private static class Strategy3 implements Appointment_RightImplement {
        public String getCode() {
            return "THREE";
        }
    }
    private static class Strategy4 implements Appointment_RightImplement {
        public String getCode() {
            return "FOUR";
        }
    }
    private static class Strategy5 implements Appointment_RightImplement {
        public String getCode() {
            return "FIVE";
        }
    }
    private static class Strategy6 implements Appointment_RightImplement {
        public String getCode() {
            return "SIX";
        }
    }
    private static class Strategy7 implements Appointment_RightImplement {
        public String getCode() {
            return "SEVEN";
        }
    }
    /**
     * 请用委派模式完成以下代码
     */
    public static String getResult(int result) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, new Strategy1().getCode());
        map.put(2, new Strategy2().getCode());
        map.put(3, new Strategy3().getCode());
        map.put(4, new Strategy4().getCode());
        map.put(5, new Strategy5().getCode());
        map.put(6, new Strategy6().getCode());
        map.put(7, new Strategy7().getCode());
        String res = null;
        System.out.println("result的值:"+result);
        for(int key:map.keySet()) {
            if(result==key) {
                res=map.get(key);
            }
        }
        return res;
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
        //生成1~7的随机数
        int result = random.nextInt(7) + 1;
        System.out.println(getResult(result));
    }
}
