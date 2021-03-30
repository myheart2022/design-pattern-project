package com.design.pattern.strategyPattern;

/**
 * @Classname StrategyA
 * @Description
 * @Date 2021/3/25 23:48
 * @Created by white
 */
public class StrategyA implements Strategy {
    @Override
    public void doOperate() {
        System.out.println("执行策略A");
    }
}