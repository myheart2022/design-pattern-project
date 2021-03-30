package com.design.pattern.singletonPattern;

/**
 * @Classname ObjectFour
 * @Description 静态内部类
 * @Date 2021/3/28 14:00
 * @Created by white
 */
public class ObjectFour {
    private static class SingletonHolder {
        private static final ObjectFour INSTANCE = new ObjectFour();
    }
    private ObjectFour (){}
    public static ObjectFour getInstance() {
        return SingletonHolder.INSTANCE;
    }
}