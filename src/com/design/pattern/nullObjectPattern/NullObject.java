package com.design.pattern.nullObjectPattern;

/**
 * @Classname NullObject
 * @Description
 * @Date 2021/3/26 18:41
 * @Created by white
 */
public class NullObject extends AbstractObject {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Error";
    }
}