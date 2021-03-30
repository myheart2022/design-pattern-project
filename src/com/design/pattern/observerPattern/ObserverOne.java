package com.design.pattern.observerPattern;

/**
 * @Classname ObserverOne
 * @Description
 * @Date 2021/3/24 23:08
 * @Created by white
 */
public class ObserverOne extends Observer{
    ObserverOne(Subject subject){
        this.subject = subject;
        subject.addObserver(this);
    }
    @Override
    public void update(String status) {
        System.out.println("one收到被观察者改变状态："+status);
    }
}