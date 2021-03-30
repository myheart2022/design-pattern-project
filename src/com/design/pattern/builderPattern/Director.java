package com.design.pattern.builderPattern;

/**
 * @Classname Director
 * @Description 指挥类，可以使用这个类去设置一些通用的属性
 * @Date 2021/3/28 23:28
 * @Created by white
 */
public class Director {
    private ComputerBuilder builder;
    Director(ComputerBuilder builder){
        this.builder = builder;
    }

    public Computer construct(String name,int cpuPrice,int diskPrice,int boardPrice,int memoryPrice){
        builder.buildName(name);
        builder.buildCpu("CPU",cpuPrice);
        builder.buildDisk("硬盘",diskPrice);
        builder.buildMainBoard("主板",boardPrice);
        builder.buildMemory("内存",memoryPrice);
        return builder.build();
    }
}