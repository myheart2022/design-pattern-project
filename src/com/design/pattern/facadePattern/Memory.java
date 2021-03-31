package com.design.pattern.facadePattern;

/**
 * @Classname Memory
 * @Description
 * @Date 2021/3/31 18:06
 * @Created by white
 */
public class Memory {
    void start(){
        System.out.println("内存启动");
    }

    void readWrite(){
        System.out.println("内存读写");
    }

    void stop(){
        System.out.println("内存断电");
    }
}