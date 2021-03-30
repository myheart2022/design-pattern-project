package com.design.pattern.mementoPattern;

/**
 * @Classname Television
 * @Description
 * @Date 2021/3/23 10:54
 * @Created by white
 */
public class Television implements Cloneable{
    private int size ;
    private String show;
    Television(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getShow() {
        return show;
    }

    public Television clone(){
        try {
            return (Television)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void setShow(String show) {
        this.show = show;
        System.out.println("播放"+show);
    }

    public Television setShowToMemento(){
        return clone();
    }

    public void setShowFromMemento(Television m){
        if(m==null){
            return;
        }
        setShow(m.getShow());
    }
}