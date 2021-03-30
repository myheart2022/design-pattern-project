package com.design.pattern.adapter;

/**
 * @Classname AbstractMusicPlayer
 * @Description 适配器抽象类
 * @Date 2021/3/30 11:00
 * @Created by white
 */
public abstract class AbstractMusicPlayer implements MediaPlayer{

    public abstract void playMusic(String name);

    @Override
    public void playVideo(String name) {
        System.out.println("do nothing.");
    }
}