package com.design.pattern.chainOfResponsibilityPattern.logger;

/**
 * @Classname DebugLogger
 * @Description
 * @Date 2021/3/17 16:30
 * @Created by xupen
 */
public class DebugLogger extends AbstractLogger{

    DebugLogger(){
        this.level = AbstractLogger.DEBUG;
        this.nextLogger = new WarnLogger();
    }
    @Override
    void write(String message) {
        System.out.println("debug:"+message);
    }
}