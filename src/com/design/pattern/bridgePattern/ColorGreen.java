package com.design.pattern.bridgePattern;

/**
 * @Classname ColorGreen
 * @Description
 * @Date 2021/3/30 12:46
 * @Created by white
 */
public class ColorGreen implements Color {
    @Override
    public void useColor() {
        System.out.print("画绿色");
    }
}