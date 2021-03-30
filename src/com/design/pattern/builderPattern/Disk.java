package com.design.pattern.builderPattern;

/**
 * @Classname Disk
 * @Description
 * @Date 2021/3/28 14:50
 * @Created by white
 */
public class Disk extends AbstractAccessory {
    public Disk(String name, int price) {
        super(name, price);
    }

    @Override
    public void description() {
        System.out.println("磁盘:"+getName()+"价格是："+getPrice()+"元");
    }
}