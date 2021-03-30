package com.design.pattern.mediatorPattern;

/**
 * @Classname ChatRoom
 * @Description
 * @Date 2021/3/22 17:29
 * @Created by white
 */
public interface ChatRoom {
    void register(User user);
    void sendMessage(User user,String str);
    void quit(User user);
}