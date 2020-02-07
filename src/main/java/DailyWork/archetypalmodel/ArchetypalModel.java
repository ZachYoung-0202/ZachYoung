package DailyWork.archetypalmodel;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArchetypalModel {
    private static class Prototype1 implements Cloneable {
        public String arg1;
        protected Prototype1 clone() throws CloneNotSupportedException {
            Prototype1 pro=(Prototype1) super.clone();
            pro.setArg1("克隆后的String");
            return (Prototype1) super.clone();
        }
        public Prototype1() {
        }

        public String getArg1() {
            return arg1;
        }
        public void setArg1(String arg1) {
            this.arg1 = arg1;
        }
        public Prototype1(String arg1) {
            this.arg1 = arg1;
        }
    }

    private static class Prototype2 implements Cloneable {
        public String arg1;
        public Prototype1 arg2;
        public List<Prototype1> arg3;
        public Map<String, Prototype1> arg4;
        /**
         * 请用原型模式完成clone()，注意深克隆。
         * 相当于arg2深克隆后是全新对象，
         * arg3深克隆后是全新对象(包括list中的每个引用)，
         * arg4深克隆后是全新对象(包括map中的key、value引用)
         * @throws CloneNotSupportedException
         */
        @Override
        protected Prototype2 clone() throws CloneNotSupportedException {
            Prototype2 pro2=(Prototype2) super.clone();//首先浅克隆一个Pro2对象
            pro2.setArg1("克隆后的String");
            pro2.setArg2(pro2.getArg2().clone());
            List<Prototype1> list = this.arg3;
            List<Prototype1> newList = new ArrayList<Prototype1>();
            for(Prototype1 pro : list) {
                newList.add(pro);
            }
            pro2.setArg3(newList);
            Map<String, Prototype1> map = this.arg4;
            Map<String, Prototype1> newmap = new HashMap<String, Prototype1>(1);
            Iterator<Map.Entry<String, Prototype1>> ar4EntrySet = arg4.entrySet().iterator();
            while (ar4EntrySet.hasNext()) {
                Map.Entry<String, Prototype1> entry = ar4EntrySet.next();
                newmap.put(entry.getKey(),entry.getValue());
            }
            pro2.setArg4(newmap);
            return pro2;
        }

        public Prototype2() {
        }

        public Prototype2(String arg1, Prototype1 arg2, List<Prototype1> arg3, Map<String, Prototype1> arg4) {
            this.arg1 = arg1;
            this.arg2 = arg2;
            this.arg3 = arg3;
            this.arg4 = arg4;
        }

        public String getArg1() {
            return arg1;
        }

        public void setArg1(String arg1) {
            this.arg1 = arg1;
        }

        public Prototype1 getArg2() {
            return arg2;
        }

        public void setArg2(Prototype1 arg2) {
            this.arg2 = arg2;
        }

        public List<Prototype1> getArg3() {
            return arg3;
        }

        public void setArg3(List<Prototype1> arg3) {
            this.arg3 = arg3;
        }

        public Map<String, Prototype1> getArg4() {
            return arg4;
        }

        public void setArg4(Map<String, Prototype1> arg4) {
            this.arg4 = arg4;
        }

        @Override
        public String toString() {
            return "Prototype2 [arg1=" + arg1 + ", arg2=" + arg2 + ", arg3=" + arg3 + ", arg4=" + arg4 + "]";
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype1 prototype1 = new Prototype1("string1");
        Map<String, Prototype1> map = new HashMap<String, Prototype1>(1);
        map.put("key1", prototype1);
        Prototype2 prototype2 = new Prototype2("string2", prototype1, new ArrayList<Prototype1>(Collections.singletonList(prototype1)), map);
        Prototype2 prototype3 = prototype2.clone();
        System.out.println(prototype2 == prototype3);
        System.out.println(prototype2.arg1 == prototype3.arg1);
        System.out.println(prototype2.arg2 == prototype3.arg2);
        System.out.println(prototype2.arg2.arg1 == prototype3.arg2.arg1);
        System.out.println(prototype2.arg3 == prototype3.arg3);
        List<Prototype1> arg3 = prototype2.arg3;
        List<Prototype1> arg3Clone = prototype3.arg3;
        for (int i = 0; i < arg3.size(); i++) {
            Prototype1 arg = arg3.get(i);
            Prototype1 clone = arg3Clone.get(i);
            System.out.println(arg == clone);
            System.out.println(arg.arg1 == clone.arg1);
        }
        System.out.println(prototype2.arg4 == prototype3.arg4);
        Map<String, Prototype1> arg4 = prototype2.arg4;
        Map<String, Prototype1> arg4Clone = prototype3.arg4;
        Iterator<Map.Entry<String, Prototype1>> ar4EntrySet = arg4.entrySet().iterator();
        Iterator<Map.Entry<String, Prototype1>> ar4CloneEntrySet = arg4Clone.entrySet().iterator();
        while (ar4EntrySet.hasNext()) {
            Map.Entry<String, Prototype1> entry = ar4EntrySet.next();
            Map.Entry<String, Prototype1> entryClone = ar4CloneEntrySet.next();
            System.out.println(entry.getKey() == entryClone.getKey());
            Prototype1 value = entry.getValue();
            Prototype1 clone = entryClone.getValue();
            System.out.println(value == clone);
            System.out.println(value.arg1 == clone.arg1);
        }
    }
}

