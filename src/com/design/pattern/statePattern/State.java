package com.design.pattern.statePattern;

/**
 * @Classname State
 * @Description
 * @Date 2021/3/25 22:55
 * @Created by white
 */
public interface State {
    void handle(Context context);

    int getState();
}