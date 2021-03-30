package com.design.pattern.templatePattern;

/**
 * @Classname Game
 * @Description
 * @Date 2021/3/26 19:01
 * @Created by white
 */
public abstract class Game {
    protected String name;
    public void init(){
        System.out.println(name +"初始化完毕！");
    }

    public abstract void start();

    public abstract void stop();
}