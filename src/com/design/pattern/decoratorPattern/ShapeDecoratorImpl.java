package com.design.pattern.decoratorPattern;

/**
 * @Classname ShapeDecoratorImpl
 * @Description
 * @Date 2021/3/31 16:52
 * @Created by white
 */
public class ShapeDecoratorImpl extends ShapeDecorator {
    ShapeDecoratorImpl(Shape shape) {
        super(shape);
    }

    @Override
    void useColor(String color) {
        System.out.print("使用"+color);
    }
}