package com.design.pattern.visitorPattern;

/**
 * @Classname DataA
 * @Description
 * @Date 2021/3/26 19:30
 * @Created by white
 */
public class DataA implements Data{
    int a = 1,b = 2;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }
}