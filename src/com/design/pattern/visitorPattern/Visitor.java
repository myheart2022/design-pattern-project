package com.design.pattern.visitorPattern;

/**
 * @Classname Visitor
 * @Description
 * @Date 2021/3/26 19:29
 * @Created by white
 */
public interface Visitor {
    void visit(DataA dataA);

    void visit(DataB dataB);

    void visit(DataC dataC);
}