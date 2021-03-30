package com.design.pattern.prototypePattern;

import java.io.Serializable;

/**
 * @Classname Prototype
 * @Description
 * @Date 2021/3/29 16:26
 * @Created by white
 */
public class Prototype implements Serializable,Cloneable{
    private String name;
    private int num;

    public Prototype(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Prototype clone(){
        try {
            return (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}