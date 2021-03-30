package com.design.pattern.bridgePattern;

/**
 * @Classname ColorRed
 * @Description
 * @Date 2021/3/30 12:15
 * @Created by white
 */
public class ColorRed implements Color {
    @Override
    public void useColor() {
        System.out.print("画红色");
    }
}