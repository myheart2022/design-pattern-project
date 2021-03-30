package com.design.pattern.statePattern;

/**
 * @Classname StateC
 * @Description
 * @Date 2021/3/25 23:05
 * @Created by white
 */
public class StateC implements State{
    private static State state = new StateC();
    private StateC(){}

    @Override
    public void handle(Context context) {
        System.out.println("设置这个状态，就执行GC");
        System.gc();
    }

    @Override
    public int getState() {
        return 3;
    }

    public static State Instance() {
        return state;
    }
}