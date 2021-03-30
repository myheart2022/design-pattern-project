package com.design.pattern.adapter;

/**
 * @Classname MusicPlayer
 * @Description 只实现播放音乐的类，在有非常多的实现类时可以减少代码量
 * @Date 2021/3/30 11:10
 * @Created by white
 */
public class MusicPlayer2 extends AbstractMusicPlayer {
    @Override
    public void playMusic(String name) {
        System.out.println("音效2播放音乐："+name);
    }
}