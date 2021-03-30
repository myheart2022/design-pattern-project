package com.design.pattern.bridgePattern;

/**
 * @Classname Shape
 * @Description
 * @Date 2021/3/30 12:16
 * @Created by white
 */
public abstract class Shape {
    Pen pen;
    Shape(Pen pen){
        this.pen = pen;
    }
    abstract void drawShape();
}