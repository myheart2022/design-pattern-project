package com.design.pattern.decoratorPattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/31 16:55
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator shape1 = new ShapeDecoratorImpl(circle);
        shape1.useColor("红色");
        shape1.draw();
        ShapeDecorator shape2 = new ShapeDecoratorImpl2(circle);
        shape2.useColor("红色");
        shape2.draw();
    }
}