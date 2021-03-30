package com.design.pattern.mediatorPattern;

/**
 * @Classname User
 * @Description
 * @Date 2021/3/22 17:31
 * @Created by white
 */
public interface User {
    void register(ChatRoom chatRoom);
    void send(ChatRoom chatRoom,String str);
    void receive(String str);
    void quit(ChatRoom chatRoom);
    boolean equals(User user);
    String getName();
}