package com.design.pattern.visitorPattern;

/**
 * @Classname VisitorB
 * @Description
 * @Date 2021/3/26 19:40
 * @Created by white
 */
public class VisitorB implements Visitor {
    @Override
    public void visit(DataA dataA) {
        System.out.println("执行对A种数据的减法操作：a-b="+(dataA.getA()-dataA.getB()));
    }

    @Override
    public void visit(DataB dataB) {
        System.out.println("执行对B种数据的减法操作：a-b="+(dataB.getA()-dataB.getB()));
    }

    @Override
    public void visit(DataC dataC) {
        System.out.println("执行对C种数据的减法操作：a+b=Error,字符串不支持相减。");
    }
}