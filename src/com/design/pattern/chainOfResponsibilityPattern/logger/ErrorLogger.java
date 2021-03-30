package com.design.pattern.chainOfResponsibilityPattern.logger;

/**
 * @Classname ErrorLogger
 * @Description
 * @Date 2021/3/17 16:33
 * @Created by xupen
 */
public class ErrorLogger extends AbstractLogger{
    ErrorLogger(){
        this.level = AbstractLogger.ERROR;
        this.nextLogger = null;
    }
    @Override
    void write(String message) {
        System.err.println("error:"+message);
    }
}