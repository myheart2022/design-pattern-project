package com.design.pattern.adapter;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/30 11:22
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        TargetPlayer player = new Mp4PlayerAdapter(new Mp3Player());
        player.playMedia("mp3","寂静之声",0);
        player.playMedia("mp4","复仇者联盟",1080);

        MediaPlayer musicPlayer = new MusicPlayer();
        MediaPlayer musicPlayer2 = new MusicPlayer2();
        musicPlayer.playMusic("寂静之声");
        musicPlayer2.playMusic("寂静之声");
    }
}