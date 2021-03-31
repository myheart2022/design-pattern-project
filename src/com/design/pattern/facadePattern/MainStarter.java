package com.design.pattern.facadePattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/31 18:13
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        System.out.println();
        computer.use();
        System.out.println();
        computer.stop();
    }
}