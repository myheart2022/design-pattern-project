package com.design.pattern.singletonPattern;

/**
 * @Classname ObjectOne
 * @Description 懒汉式
 * @Date 2021/3/28 13:50
 * @Created by white
 */
public class ObjectOne {
    private static ObjectOne objectOne;
    private ObjectOne(){

    }

    /**
     * 增加synchronized关键字保证线程安全，否则并发时会创建多个对象。
     * @return
     */
    public static synchronized ObjectOne getInstance(){
        if(objectOne==null){
            objectOne = new ObjectOne();
        }
        return objectOne;
    }
}