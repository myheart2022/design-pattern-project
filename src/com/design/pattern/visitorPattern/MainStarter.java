package com.design.pattern.visitorPattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/26 19:28
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        Data a = new DataA();
        Data b = new DataB();
        Data c = new DataC();
        Visitor va = new VisitorA();
        Visitor vb = new VisitorB();
        a.accept(va);
        b.accept(va);
        c.accept(va);
        a.accept(vb);
        b.accept(vb);
        c.accept(vb);
    }
}