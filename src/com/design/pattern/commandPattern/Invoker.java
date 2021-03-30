package com.design.pattern.commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Invoker
 * @Description 命令的代理类，存储执行过的命令
 * @Date 2021/3/19 17:43
 * @Created by xupen
 */
public class Invoker {
    private List<Command> commandList = new ArrayList<>();
    private int index = 0;

    /**
     * 执行命令
     * @param command
     */
    void executeCommand(Command command){
        commandList.add(command);
        index = commandList.size();
        command.execute();
    }

    /**
     * 撤销命令,支持连续撤销
     */
    void cancel(){
        if(index==0){
            return;
        }
        commandList.get(index-1).rollback();
        index --;
    }

    /**
     * 恢复命令，支持连续恢复
     */
    void recover(){
        if(index==commandList.size()){
            return;
        }
        commandList.get(index).recover();
        index++;
    }
}