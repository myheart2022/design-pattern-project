package com.design.pattern.factoryPattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/27 23:36
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        AbstractFactory amdFactory = FactoryProducer.getFactory("AMD");
        AbstractFactory intelFactory = FactoryProducer.getFactory("Intel");
        amdFactory.getCPU(938).calculate();
        amdFactory.getMainBoard(938).installCpu();
        intelFactory.getCPU(1151).calculate();
        intelFactory.getMainBoard(1151).installCpu();
    }
}