package com.design.pattern.proxyPattren;

/**
 * @Classname Circle
 * @Description
 * @Date 2021/3/31 17:16
 * @Created by white
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}