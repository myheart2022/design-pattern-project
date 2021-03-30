package com.design.pattern.strategyPattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/25 23:51
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        Context context1 = new Context(new StrategyB());
        context.execute();
        context1.execute();
    }
}