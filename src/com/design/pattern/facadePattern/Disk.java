package com.design.pattern.facadePattern;

/**
 * @Classname Disk
 * @Description
 * @Date 2021/3/31 18:06
 * @Created by white
 */
public class Disk {
    void start(){
        System.out.println("硬盘通电");
    }

    void readWrite(){
        System.out.println("硬盘读写");
    }

    void stop(){
        System.out.println("硬盘断电");
    }
}