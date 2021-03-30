package com.design.pattern.builderPattern;

/**
 * @Classname ComputerBuilder
 * @Description 建造者的接口，可以有多个实现,如intel架构和AMD架构的
 * @Date 2021/3/28 14:34
 * @Created by white
 */
public abstract class ComputerBuilder {
    Computer computer;
    abstract void buildName(String name);
    abstract void buildCpu(String name,int price);
    abstract void buildMemory(String name,int price);
    abstract void buildMainBoard(String name,int price);
    abstract void buildDisk(String name,int price);
    Computer build(){
        return computer;
    }
}