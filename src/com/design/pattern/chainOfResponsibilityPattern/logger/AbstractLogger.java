package com.design.pattern.chainOfResponsibilityPattern.logger;

/**
 * @Classname AbstractLogger
 * @Description
 * @Date 2021/3/17 16:07
 * @Created by xupen
 */
public abstract class AbstractLogger {
     static final int INFO = 0;
     static final int DEBUG = 1;
     static final int WARN =2;
     static final int ERROR =3;

    /**
     *当前日志等级
     */
    int level;

    /**
     *责任链中的下一个日志处理类
     */
    AbstractLogger nextLogger;

    /**
     * 处理消息
     * @param level
     * @param message
     */
    void logMessage(int level,String message){
        if(level>=this.level){
            write(message);
        }
        if(nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }

    public final void info(String s){
        logMessage(INFO,s);
    }

    public final void debug(String s){
        logMessage(DEBUG,s);
    }

    public final void warn(String s){
        logMessage(WARN,s);
    }

    public final void error(String s){
        logMessage(ERROR,s);
    }
    /**
     * 打印日志
     * @param message
     */
    abstract void write(String message);

}