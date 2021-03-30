package com.design.pattern.visitorPattern;

/**
 * @Classname VisitorA
 * @Description 加法操作
 * @Date 2021/3/26 19:36
 * @Created by white
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(DataA dataA) {
        System.out.println("执行对A种数据的加法操作：a+b="+(dataA.getA()+dataA.getB()));
    }

    @Override
    public void visit(DataB dataB) {
        System.out.println("执行对B种数据的加法操作：a+b="+(dataB.getA()+dataB.getB()));
    }

    @Override
    public void visit(DataC dataC) {
        System.out.println("执行对C种数据的加法操作："+dataC.getName()+":"+dataC.getA()+" "+dataC.getB());
    }
}