package com.design.pattern.observerPattern;

/**
 * @Classname Observer
 * @Description
 * @Date 2021/3/24 23:06
 * @Created by white
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update(String status);
}