package com.design.pattern.mediatorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname ChatRoomOne
 * @Description 公共聊天室
 * @Date 2021/3/22 17:33
 * @Created by white
 */
public class ChatRoomOne implements ChatRoom {
    List<User> list = new ArrayList<>();

    @Override
    public void register(User user) {
        if(!list.contains(user)){
            for(User usr:list){
                usr.receive(user.getName()+"进入了聊天室。");
            }
            user.receive("您进入了聊天室。");
            list.add(user);
        }
    }

    @Override
    public void sendMessage(User user, String str) {
        String name = "<ChatRoomOne>"+user.getName()+":";
        for(User usr:list){
            if(!usr.equals(user)){
                usr.receive(name+str);
            }
        }
    }

    @Override
    public void quit(User user) {
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            User usr = iterator.next();
            if (usr.equals(user)){
                iterator.remove();
            }else{
                usr.receive(user.getName()+"退出聊天室。");
            }
        }
    }
}