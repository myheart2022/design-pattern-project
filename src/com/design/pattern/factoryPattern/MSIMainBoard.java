package com.design.pattern.factoryPattern;

/**
 * @Author white
 * @Description Msi 主板实现
 * @Date 2019/6/4 17:08
 */
public class MSIMainBoard implements MainBoard{
    private int cpuHoles = 0;
    public MSIMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }
    public void installCpu() {
        System.out.println("GA MainBoard 插孔数：" + cpuHoles);
    }
}