package com.design.pattern.simpleFactoryPattern;

/**
 * @Author white
 * @Description IntelCpu的实现
 * @Date 2019/6/4 16:32
 */
public class IntelCpu implements CPU {
    //cpu针脚数
    private int pins ;
    public IntelCpu(int pins){
        this.pins =pins;
    }

    public void calculate() {
        System.out.println("INTEL CPU is running.");
    }
}