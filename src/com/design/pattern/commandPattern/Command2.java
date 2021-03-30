package com.design.pattern.commandPattern;

/**
 * @Classname Command2
 * @Description
 * @Date 2021/3/19 17:41
 * @Created by xupen
 */
public class Command2 implements Command {
    @Override
    public void execute() {
        System.out.println("命令 2 执行了！");
    }

    @Override
    public void rollback() {
        System.out.println("命令 2 撤销了！");
    }

    @Override
    public void recover() {
        System.out.println("恢复命令 2 的撤销操作！");
    }
}