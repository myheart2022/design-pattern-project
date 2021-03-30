package com.design.pattern.simpleFactoryPattern;

/**
 * @Author white
 * @Description AMDcpu实现
 * @Date 2019/6/4 16:38
 */
public class AMDCpu implements CPU {
    //针脚数
    private int pins = 0;
    public AMDCpu(int pins) {
        this.pins = pins;
    }
    public void calculate() {
        System.out.println("AMD CPU is running.");
    }
}