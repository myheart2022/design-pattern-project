package com.design.pattern.adapter;

/**
 * @Classname MediaPlayer
 * @Description 待适配的接口
 * @Date 2021/3/30 11:02
 * @Created by white
 */
public interface MediaPlayer {
    void playMusic(String name);
    void playVideo(String name);
}