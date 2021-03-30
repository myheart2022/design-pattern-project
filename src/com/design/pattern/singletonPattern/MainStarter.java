package com.design.pattern.singletonPattern;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/28 14:02
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        ObjectOne objectOne = ObjectOne.getInstance();
        ObjectTwo objectTwo = ObjectTwo.getInstance();
        ObjectThree objectThree = ObjectThree.getInstance();
        ObjectFour objectFour = ObjectFour.getInstance();
        ObjectFive objectFive = ObjectFive.INSTANCE;
    }
}