package com.design.pattern.nullObjectPattern;

/**
 * @Classname RealObject
 * @Description
 * @Date 2021/3/26 18:39
 * @Created by white
 */
public class RealObject extends AbstractObject{


    public RealObject(String name) {
        super();
        super.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}