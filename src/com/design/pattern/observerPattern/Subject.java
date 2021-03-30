package com.design.pattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Subject
 * @Description
 * @Date 2021/3/24 23:06
 * @Created by white
 */
public class Subject {
    private String status;
    private List<Observer> list = new ArrayList<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println("status:"+status);
        for(Observer observer:list){
            observer.update(status);
        }
    }

    public void addObserver(Observer observer) {
        if(!list.contains(observer)){
            list.add(observer);
        }
    }
}