package com.design.pattern.chainOfResponsibilityPattern.logger;

/**
 * @Classname WarnLogger
 * @Description
 * @Date 2021/3/17 16:32
 * @Created by xupen
 */
public class WarnLogger extends AbstractLogger{
    WarnLogger(){
        this.level = AbstractLogger.WARN;
        this.nextLogger = new ErrorLogger();
    }
    @Override
    void write(String message) {
        System.out.println("warn:"+message);
    }
}