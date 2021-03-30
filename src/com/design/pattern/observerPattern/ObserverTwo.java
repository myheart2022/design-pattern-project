package com.design.pattern.observerPattern;

/**
 * @Classname ObserverTwo
 * @Description
 * @Date 2021/3/24 23:13
 * @Created by white
 */
public class ObserverTwo extends Observer {
    ObserverTwo(Subject subject){
        this.subject = subject;
        subject.addObserver(this);
    }
    @Override
    public void update(String status) {
        System.out.println("two收到被观察者改变状态："+status);
    }
}