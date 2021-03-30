package com.design.pattern.bridgePattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/30 12:28
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        Pen pen = new Pen1(new ColorRed());
        pen.draw();
        System.out.println();
        Shape circle = new ShapeCircle(pen);
        circle.drawShape();

        //扩展一种颜色
        circle = new ShapeCircle(new Pen1(new ColorGreen()));
        circle.drawShape();

        //扩展一种形状……
        //扩展一种笔……

    }
}