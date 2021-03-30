package com.design.pattern.mementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname MementoHistory
 * @Description
 * @Date 2021/3/23 11:03
 * @Created by white
 */
public class MementoHistory {
    List<Television> list = new ArrayList<>();
    public void addMemento(Television memento){
        list.add(memento);
    }
    public Television getMemento(int index){
        if(index>list.size()||index<0){
            return null;
        }
        System.out.println("获取第"+(index+1)+"个观看的节目：");
        return list.get(index);
    }
}