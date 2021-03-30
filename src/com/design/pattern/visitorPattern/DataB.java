package com.design.pattern.visitorPattern;

/**
 * @Classname DataB
 * @Description
 * @Date 2021/3/26 19:33
 * @Created by white
 */
public class DataB implements Data {

    double a =1.1,b = 1.2;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }
}