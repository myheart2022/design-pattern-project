package com.design.pattern.bridgePattern;

/**
 * @Classname ShapeCircle
 * @Description
 * @Date 2021/3/30 12:27
 * @Created by white
 */
public class ShapeCircle extends Shape{

    ShapeCircle(Pen pen) {
        super(pen);
    }

    @Override
    void drawShape() {
        pen.draw();
        System.out.println("圆形");
    }
}