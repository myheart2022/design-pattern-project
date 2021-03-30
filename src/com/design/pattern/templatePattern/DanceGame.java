package com.design.pattern.templatePattern;

/**
 * @Classname DanceGame
 * @Description
 * @Date 2021/3/26 19:06
 * @Created by white
 */
public class DanceGame extends Game{
    DanceGame(){
        name = "DanceGame";
    }
    @Override
    public void start() {
        System.out.println("开始跳舞游戏，唱跳！");
    }

    @Override
    public void stop() {
        System.out.println("停止跳舞有消息，聊聊天！");
    }
}