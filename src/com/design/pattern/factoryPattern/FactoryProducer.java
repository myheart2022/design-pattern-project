package com.design.pattern.factoryPattern;

/**
 * @Classname FactoryProducer
 * @Description
 * @Date 2021/3/27 22:13
 * @Created by white
 */
public abstract class FactoryProducer {
    public static AbstractFactory getFactory(String name){
        if(name.equals("AMD")){
            return new AmdFactory();
        }else if(name.equals("Intel")){
            return new IntelFactory();
        }
        return null;
    }
}