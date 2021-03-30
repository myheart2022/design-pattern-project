package com.design.pattern.templatePattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/26 19:01
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        Game m = new DanceGame();
        m.init();
        m.start();
        m.stop();
        Game n = new FootballGame();
        n.init();
        n.start();
        n.stop();
    }
}