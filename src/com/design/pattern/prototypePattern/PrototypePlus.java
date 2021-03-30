package com.design.pattern.prototypePattern;

import java.io.Serializable;

/**
 * @Classname PrototypePlus
 * @Description
 * @Date 2021/3/29 16:28
 * @Created by white
 */
public class PrototypePlus implements Serializable,Cloneable{
    public PrototypePlus(String address, int length, int index, Prototype prototype) {
        this.address = address;
        this.length = length;
        this.index = index;
        this.prototype = prototype;
    }

    private String address;
    private int length;
    private int index;
    private Prototype prototype;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public PrototypePlus clone(){
        try {
            return (PrototypePlus)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "PrototypePlus{" +
                "address='" + address + '\'' +
                ", length=" + length +
                ", index=" + index +
                ", prototype=" + prototype.toString() +
                '}';
    }
}