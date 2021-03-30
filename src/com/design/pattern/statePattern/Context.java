package com.design.pattern.statePattern;

/**
 * @Classname Context
 * @Description
 * @Date 2021/3/25 22:56
 * @Created by white
 */
public class Context {
    private String name;
    private int state;
    Context(String name){
        this.name = name;
    }
    void setState(State state){
        this.state = state.getState();
        state.handle(this);
    }
    public String getName(){
        return name;
    }
}