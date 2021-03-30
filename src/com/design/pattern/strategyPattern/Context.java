package com.design.pattern.strategyPattern;

/**
 * @Classname Context
 * @Description
 * @Date 2021/3/25 23:44
 * @Created by white
 */
public class Context {
    private Strategy strategy;
    Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doOperate();
    }
}