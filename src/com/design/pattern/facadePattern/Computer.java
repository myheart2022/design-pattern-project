package com.design.pattern.facadePattern;

/**
 * @Classname Computer
 * @Description
 * @Date 2021/3/31 18:06
 * @Created by white
 */
public class Computer {
    private Cpu cpu;
    private Disk disk;
    private Memory memory;
    Computer(){
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }

    void start(){
        System.out.println("启动电源");
        cpu.start();
        memory.start();
        disk.start();
    }

    void use(){
        System.out.println("使用电脑");
        cpu.calculate();
        memory.readWrite();
        disk.readWrite();
    }

    void stop(){
        System.out.println("关闭电源");
        cpu.stop();
        memory.stop();
        disk.stop();
    }
}