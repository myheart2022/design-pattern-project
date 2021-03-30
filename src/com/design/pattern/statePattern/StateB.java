package com.design.pattern.statePattern;

/**
 * @Classname StateB
 * @Description
 * @Date 2021/3/25 23:03
 * @Created by white
 */
public class StateB implements State {
    private static State state = new StateB();
    private StateB(){}
    @Override
    public void handle(Context context) {
        System.out.println("设置这个状态，就打印context的toString方法");
        System.out.println(context);
    }

    @Override
    public int getState() {
        return 2;
    }

    public static State Instance() {
        return state;
    }
}