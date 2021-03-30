package com.design.pattern.mediatorPattern;

/**
 * @Classname MainStart
 * @Description
 * @Date 2021/3/22 17:29
 * @Created by white
 */
public class MainStart {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoomOne();
        ChatRoom chatRoom = new ChatRoomTwo();
        User julie = new UserJulie("Julie");
        User bob = new UserJulie("Bob");
        User john = new UserJulie("John");
        User mary = new UserJulie("Mary");
        julie.register(room);
        bob.register(room);
        john.register(room);
        bob.register(chatRoom);
        john.register(chatRoom);
        mary.register(chatRoom);
        john.send(room,"Hello !");
//        bob.send(chatRoom,"Hi!");
        mary.register(room);
        julie.send(room,"你们好呀！");
        mary.quit(room);
        julie.send(room,"有人在吗！");
    }
}