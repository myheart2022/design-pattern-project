package com.design.pattern.statePattern;

/**
 * @Classname StateA
 * @Description
 * @Date 2021/3/25 23:01
 * @Created by white
 */
public class StateA implements State {
    private static State state = new StateA();
    private StateA(){}
    @Override
    public void handle(Context context) {
        System.out.println("设置这个状态，就打印context的name");
        System.out.println("name="+context.getName());
    }

    @Override
    public int getState() {
        return 1;
    }

    public static State Instance() {
        return state;
    }

}