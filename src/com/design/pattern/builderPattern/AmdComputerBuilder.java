package com.design.pattern.builderPattern;

/**
 * @Classname AmdComputerBuilder
 * @Description
 * @Date 2021/3/28 14:51
 * @Created by white
 */
public class AmdComputerBuilder extends ComputerBuilder {
    AmdComputerBuilder(){
        computer = new Computer();
    }

    @Override
    void buildName(String name) {
        computer.setName(name);
    }

    @Override
    void buildCpu(String name,int price) {
        computer.setCpu(new Cpu(name,price));
    }

    @Override
    void buildMemory(String name,int price) {
        computer.setMemory(new Memory(name,price));
    }

    @Override
    void buildMainBoard(String name,int price) {
        computer.setMainBoard(new MainBoard(name,price));
    }

    @Override
    void buildDisk(String name,int price) {
        computer.setDisk(new Disk(name,price));
    }


}