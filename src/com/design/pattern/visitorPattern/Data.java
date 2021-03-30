package com.design.pattern.visitorPattern;

/**
 * @Classname Data
 * @Description
 * @Date 2021/3/26 19:29
 * @Created by white
 */
public interface Data {
    void accept(Visitor visitor);
}