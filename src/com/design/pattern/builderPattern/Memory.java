package com.design.pattern.builderPattern;

/**
 * @Classname Memory
 * @Description
 * @Date 2021/3/28 14:50
 * @Created by white
 */
public class Memory extends AbstractAccessory {
    public Memory(String name, int price) {
        super(name, price);
    }

    @Override
    public void description() {
        System.out.println("内存:"+getName()+"价格是："+getPrice()+"元");
    }
}