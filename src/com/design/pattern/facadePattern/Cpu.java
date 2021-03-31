package com.design.pattern.facadePattern;

/**
 * @Classname Cpu
 * @Description
 * @Date 2021/3/31 18:06
 * @Created by white
 */
public class Cpu {
    void start(){
        System.out.println("cpu启动");
    }

    void calculate(){
        System.out.println("cpu计算");
    }

    void stop(){
        System.out.println("cpu断电");
    }
}