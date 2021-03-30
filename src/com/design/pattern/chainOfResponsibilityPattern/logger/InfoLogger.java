package com.design.pattern.chainOfResponsibilityPattern.logger;

/**
 * @Classname InfoLogger
 * @Description
 * @Date 2021/3/17 16:27
 * @Created by xupen
 */
public class InfoLogger extends AbstractLogger{

    public InfoLogger(){
        this.level = AbstractLogger.INFO;
        this.nextLogger = new DebugLogger();
    }
    @Override
    void write(String message) {
        System.out.println("info:"+message);
    }
}