package com.design.pattern.nullObjectPattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/26 18:35
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        AbstractObject a = ObjectFactory.createObject("A");
        System.out.println(a.getName());
        System.out.println(a.isNull());
        AbstractObject b = ObjectFactory.createObject("B");
        System.out.println(b.getName());
        System.out.println(b.isNull());
        AbstractObject d = ObjectFactory.createObject("D");
        System.out.println(d.getName());
        System.out.println(d.isNull());

    }
}