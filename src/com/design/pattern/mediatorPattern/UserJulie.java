package com.design.pattern.mediatorPattern;

/**
 * @Classname UserJulie
 * @Description
 * @Date 2021/3/22 17:57
 * @Created by white
 */
public class UserJulie implements User{
    private String userName;
    UserJulie(String name){
        userName = name;
    };
    @Override
    public void register(ChatRoom chatRoom) {
        chatRoom.register(this);
    }

    @Override
    public void send(ChatRoom chatRoom,String str) {
        chatRoom.sendMessage(this,str);
    }

    @Override
    public void receive(String str) {
        System.out.println("["+userName+"] "+str);
    }

    @Override
    public void quit(ChatRoom chatRoom) {
        chatRoom.quit(this);
    }

    @Override
    public String getName() {
        return userName;
    }

    public boolean equals(User user){
        return userName.equals(user.getName());
    }
}