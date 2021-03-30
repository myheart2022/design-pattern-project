package com.design.pattern.builderPattern;

/**
 * @Classname Computer
 * @Description
 * @Date 2021/3/28 14:51
 * @Created by white
 */
public class Computer {
    private String name;
    private Disk disk;
    private Cpu cpu;
    private MainBoard mainBoard;
    private Memory memory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Disk getDisk() {
        return disk;

    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    void description(){
        System.out.println(name);
        getCpu().description();
        getDisk().description();
        getMainBoard().description();
        getMemory().description();
    }

}