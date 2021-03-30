package com.design.pattern.nullObjectPattern;

import java.util.ArrayList;

/**
 * @Classname ObjectFactory
 * @Description
 * @Date 2021/3/26 18:41
 * @Created by white
 */
public class ObjectFactory {
    public static AbstractObject createObject(String name){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        if(list.contains(name)){
            return new RealObject(name);
        }else{
            return new NullObject();
        }
    }
}