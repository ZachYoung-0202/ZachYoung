package test_java.java;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {
    public static void main(String[] args) {
        Person json = new Person(21,"young");
        List<Person> list = new ArrayList<Person>();
        list.add(json);
        list.add(new Person(22,"Anny"));
        //将集合对象序列化为Json
        System.out.println(JSON.toJSON(json));
        //list里的对象
        System.out.println("list里的内容");
        System.out.println(JSON.toJSON(list));
        //反序列化成对象
        Person person = JSON.parseObject("{\"name\":\"杨志良\",\"age\":19}",Person.class);
        System.out.println("姓名:"+person.getName()+"    "+"年龄"+person.getAge());
    }
}
