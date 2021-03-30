package com.design.pattern.observerPattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/24 23:14
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new ObserverOne(subject);
        Observer observer1 = new ObserverTwo(subject);
        subject.setStatus("hhhh");
    }
}