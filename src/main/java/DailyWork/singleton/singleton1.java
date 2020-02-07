package DailyWork.singleton;

import java.io.Serializable;

/** 
 * 
 * 
 * �������ò��ã����������˷��ڴ档 
 */ 
public class singleton1 implements Serializable { 
    private  static  final singleton1 SINGLETON = new singleton1();
    private singleton1(){ 
        if(SINGLETON != null ){ 
            throw new RuntimeException("SINGLETON already exist!"); 
        } 
    } 
    private Object readResolve(){ 
        return SINGLETON; 
    }
    public static final singleton1 getInstance(){ 
        return SINGLETON; 
    } 
 
}
