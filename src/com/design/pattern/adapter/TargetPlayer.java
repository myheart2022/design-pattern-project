package com.design.pattern.adapter;

/**
 * @Classname TargetPlayer
 * @Description 目标适配接口
 * @Date 2021/3/30 10:24
 * @Created by white
 */
public interface TargetPlayer {
    void playMedia(String type,String name,int size);
}