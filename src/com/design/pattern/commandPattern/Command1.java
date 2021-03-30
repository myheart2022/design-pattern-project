package com.design.pattern.commandPattern;

/**
 * @Classname Command1
 * @Description
 * @Date 2021/3/19 17:39
 * @Created by xupen
 */
public class Command1 implements Command {
    @Override
    public void execute() {
        System.out.println("命令 1 执行了 ！");
    }

    @Override
    public void rollback() {
        System.out.println("命令 1 撤销了 ！");
    }

    @Override
    public void recover() {
        System.out.println("恢复命令 1 的撤销操作！");
    }
}