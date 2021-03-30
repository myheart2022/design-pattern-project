package com.design.pattern.adapter;

/**
 * @Classname Mp4PlayerAdapter
 * @Description 适配器类，通过继承被适配类或持有被适配类的对象实现对其方法的调用
 * @Date 2021/3/30 10:47
 * @Created by white
 */
public class Mp4PlayerAdapter extends Mp4Player implements TargetPlayer{
    Mp3Player mp3Player;

    Mp4PlayerAdapter(Mp3Player mp3Player){
        this.mp3Player = mp3Player;
    }

    @Override
    public void playMedia(String type, String name, int size) {
        System.out.print("媒体播放器");
        if(type.equalsIgnoreCase("mp3")){
            mp3Player.playMp3(name);
        }else{
            playMp4(name,size);
        }
    }
}