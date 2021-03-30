package com.design.pattern.adapter;

/**
 * @Classname Mp4Player
 * @Description 待适配的类
 * @Date 2021/3/30 10:44
 * @Created by white
 */
public class Mp4Player {
    void playMp4(String name,int size){
        System.out.println("播放Mp4:"+name+",视频尺寸是:"+size);
    }
}