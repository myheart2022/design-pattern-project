package com.design.pattern.singletonPattern;

/**
 * @Classname ObjectTwo
 * @Description 饿汉式
 * @Date 2021/3/28 13:53
 * @Created by white
 */
public class ObjectTwo {
    private static ObjectTwo objectTwo = new ObjectTwo();
    private ObjectTwo(){
    }
    public static ObjectTwo getInstance(){
        return objectTwo;
    }
}