package com.design.pattern.builderPattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/28 14:59
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        AmdComputerBuilder builder = new AmdComputerBuilder();
        builder.buildName("第一台电脑");
        builder.buildCpu("AMD最新一代CPU",800);
        builder.buildDisk("西部数据",300);
        builder.buildMainBoard("微星主板",400);
        builder.buildMemory("金士顿8G",300);
        Computer computer = builder.build();
        computer.description();
        System.out.println();

        //使用指挥类
        Director director = new Director(builder);
        director.construct("第二台电脑",100,120,130,111).description();
    }
}