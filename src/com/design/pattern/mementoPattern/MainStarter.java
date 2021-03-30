package com.design.pattern.mementoPattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/23 11:01
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        Television tv = new Television(27);
        MementoHistory history = new MementoHistory();
        tv.setShow("中央一台");
        history.addMemento(tv.setShowToMemento());
        tv.setShow("江西卫视");
        history.addMemento(tv.setShowToMemento());
        tv.setShow("浙江卫视");
        history.addMemento(tv.setShowToMemento());
        tv.setShow("海南卫视");
        history.addMemento(tv.setShowToMemento());
        tv.setShowFromMemento(history.getMemento(2));
    }
}