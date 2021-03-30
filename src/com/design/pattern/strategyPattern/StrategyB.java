package com.design.pattern.strategyPattern;

/**
 * @Classname StrategyB
 * @Description
 * @Date 2021/3/25 23:49
 * @Created by white
 */
public class StrategyB implements Strategy {
    @Override
    public void doOperate() {
        System.out.println("执行策略B");
    }
}