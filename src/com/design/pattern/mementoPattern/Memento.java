package com.design.pattern.mementoPattern;

/**
 * @Classname Memento
 * @Description
 * @Date 2021/3/23 10:52
 * @Created by white
 */
public class Memento implements Cloneable{
    private String show;
    Memento(String show) {
        this.show = show;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public Memento clone(){
        try {
            return (Memento)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}