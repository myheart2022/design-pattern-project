package com.design.pattern.builderPattern;

/**
 * @Classname AbstractAccessory
 * @Description
 * @Date 2021/3/28 14:44
 * @Created by white
 */
public abstract class AbstractAccessory implements Accessory {
    String name;
    int price;
    AbstractAccessory(String name,int price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public int getPrice(){
        return price;
    }
}