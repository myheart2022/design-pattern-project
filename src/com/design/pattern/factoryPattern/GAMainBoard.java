package com.design.pattern.factoryPattern;

/**
 * @Author white
 * @Description GA主板
 * @Date 2019/6/4 17:04
 */
public class GAMainBoard implements MainBoard {
    private int cpuHoles = 0;
    public GAMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }
    public void installCpu() {
        System.out.println("GA MainBoard 插孔数：" + cpuHoles);
    }
}