package com.design.pattern.commandPattern;

/**
 * @Classname MainStarter
 * @Description 命令模式启动类
 * @Date 2021/3/19 17:36
 * @Created by xupen
 */
public class MainStarter {
    public static void main(String[] args) {
        Command command1 = new Command1();
        Command command2 = new Command2();
        Command command3 = new Command1();
        Invoker invoker = new Invoker();
        invoker.executeCommand(command1);
        invoker.executeCommand(command2);
        invoker.executeCommand(command3);
        invoker.cancel();
        invoker.cancel();
        invoker.cancel();
        invoker.recover();
        invoker.recover();
    }
}