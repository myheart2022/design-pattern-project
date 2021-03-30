package com.design.pattern.templatePattern;

/**
 * @Classname FootballGame
 * @Description
 * @Date 2021/3/26 19:04
 * @Created by white
 */
public class FootballGame extends Game{
    FootballGame(){
        name = "BallGame";
    }
    @Override
    public void start() {
        System.out.println("开始足球运动，跑踢！");
    }

    @Override
    public void stop() {
        System.out.println("停止足球运动，坐下来喝杯水！");
    }
}