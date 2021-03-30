package com.design.pattern.statePattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/25 23:06
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        Context context= new Context("test");
        context.setState(StateA.Instance());
        context.setState(StateB.Instance());
        context.setState(StateC.Instance());
        context.setState(StateB.Instance());
    }
}