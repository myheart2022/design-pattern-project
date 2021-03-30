package com.design.pattern.bridgePattern;

/**
 * @Classname Pen1
 * @Description
 * @Date 2021/3/30 12:25
 * @Created by white
 */
public class Pen1 extends Pen {
    Pen1(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("用钢笔");
        color.useColor();
    }
}