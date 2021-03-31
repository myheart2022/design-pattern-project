package com.design.pattern.decoratorPattern;

/**
 * @Classname ShapeDecoratorImpl2
 * @Description
 * @Date 2021/3/31 16:54
 * @Created by white
 */
public class ShapeDecoratorImpl2 extends ShapeDecorator {
    ShapeDecoratorImpl2(Shape shape) {
        super(shape);
    }

    @Override
    void useColor(String color) {
        System.out.print("使用浅"+color);
    }
}