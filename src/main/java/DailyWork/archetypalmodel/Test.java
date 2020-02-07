package DailyWork.archetypalmodel;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
    private static class Prototype1 implements Serializable {

        private static final long serialVersionUID = 1360672410469270728L;

        public String arg1;

        public Prototype1() {
        }

        public Prototype1(String arg1) {
            this.arg1 = arg1;
        }
    }

    private static class Prototype2 implements Cloneable, Serializable {

        private static final long serialVersionUID = 5437683396965820858L;

        public String arg1;
        public Prototype1 arg2;
        public List<Prototype1> arg3;
        public Map<String, Prototype1> arg4;

        /**
         * 请用原型模式完成clone()，注意深克隆。
         * 相当于arg2深克隆后是全新对象，
         * arg3深克隆后是全新对象(包括list中的每个引用)，
         * arg4深克隆后是全新对象(包括map中的key、value引用)
         */
        @Override
        protected Prototype2 clone() throws CloneNotSupportedException {
            //将对象写到流里

            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
                objectOutputStream.writeObject(this);
                objectOutputStream.flush();
                objectOutputStream.close();
                //从流里读出来
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);
                ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
                Object object = objectInputStream.readObject();
                objectInputStream.close();
                return (Prototype2) object;
            } catch (IOException | ClassNotFoundException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
            return null;

        }

        public Prototype2() {
        }

        public Prototype2(String arg1, Prototype1 arg2, List<Prototype1> arg3, Map<String, Prototype1> arg4) {
            this.arg1 = arg1;
            this.arg2 = arg2;
            this.arg3 = arg3;
            this.arg4 = arg4;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype1 prototype1 = new Prototype1("string1");
        Map<String, Prototype1> map = new HashMap<>(1);
        map.put("key1", prototype1);
        Prototype2 prototype2 = new Prototype2("string2", prototype1, new ArrayList<>(Collections.singletonList(prototype1)), map);
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
