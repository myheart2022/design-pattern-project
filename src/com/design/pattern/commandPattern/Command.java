package com.design.pattern.commandPattern;

/**
 * @Classname Command
 * @Description 命令的接口
 * @Date 2021/3/19 17:37
 * @Created by xupen
 */
public interface Command {
    void execute();
    void rollback();
    void recover();
}