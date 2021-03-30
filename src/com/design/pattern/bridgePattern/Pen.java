package com.design.pattern.bridgePattern;

/**
 * @Classname Pen
 * @Description
 * @Date 2021/3/30 12:23
 * @Created by white
 */
public abstract class Pen {
    Color color;
    Pen (Color color){
        this.color = color;
    }
    abstract void draw();
}