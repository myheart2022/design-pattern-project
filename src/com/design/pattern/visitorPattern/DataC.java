package com.design.pattern.visitorPattern;

/**
 * @Classname DataC
 * @Description
 * @Date 2021/3/26 19:33
 * @Created by white
 */
public class DataC implements Data {
    String a = "A",b="B";
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName(){
        return "dataC:";
    }

    public String getA(){
        return a;
    }
    public String getB(){
        return b;
    }
}