package com.design.pattern.decoratorPattern;

/**
 * @Classname Circle
 * @Description
 * @Date 2021/3/31 16:43
 * @Created by white
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}