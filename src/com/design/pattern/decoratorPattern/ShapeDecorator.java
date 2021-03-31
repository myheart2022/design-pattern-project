package com.design.pattern.decoratorPattern;

/**
 * @Classname ShapeDecorator
 * @Description
 * @Date 2021/3/31 16:44
 * @Created by white
 */
public abstract class ShapeDecorator implements Shape {
    Shape shape;
    ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    @Override
    public void draw() {
        shape.draw();
    }

    abstract void useColor(String color);
}