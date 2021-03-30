package com.design.pattern.builderPattern;

/**
 * @Classname MainBoard
 * @Description
 * @Date 2021/3/28 14:42
 * @Created by white
 */
public class MainBoard extends AbstractAccessory {
    public MainBoard(String name, int price) {
        super(name, price);
    }

    @Override
    public void description() {
        System.out.println("主板:"+getName()+"价格是："+getPrice()+"元");
    }
}