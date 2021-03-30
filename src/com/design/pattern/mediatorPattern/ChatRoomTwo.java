package com.design.pattern.mediatorPattern;

import java.util.*;

/**
 * @Classname ChatRoomTwo
 * @Description 匿名聊天室
 * @Date 2021/3/22 17:48
 * @Created by white
 */
public class ChatRoomTwo implements ChatRoom{
    Map<User,String> map = new HashMap();
    int index = 0;

    @Override
    public void register(User user) {
        if(!map.containsKey(user)){
            map.put(user,getPrivateName());
        }
    }

    @Override
    public void sendMessage(User user, String str) {
        String name = map.get(user);
        map.forEach((k,v)->{
            if(!user.equals(k)){
                k.receive("<ChatRoomTwo>"+name+":"+str);
            }
        });
    }

    private String getPrivateName(){
        return "user"+index++;
    }

    @Override
    public void quit(User user) {
        String name = map.remove(user);
        map.forEach((k,v)->{
            k.receive("<ChatRoomTwo>"+name+"退出了聊天室！");
        });
    }
}