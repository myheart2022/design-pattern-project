package com.design.pattern.builderPattern;

/**
 * @Classname Cpu
 * @Description
 * @Date 2021/3/28 14:49
 * @Created by white
 */
public class Cpu extends AbstractAccessory {
    public Cpu(String name, int price) {
        super(name, price);
    }

    @Override
    public void description() {
        System.out.println("CPU:"+getName()+"价格是："+getPrice()+"元");
    }
}