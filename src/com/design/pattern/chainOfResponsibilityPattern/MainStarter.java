package com.design.pattern.chainOfResponsibilityPattern;

import com.design.pattern.chainOfResponsibilityPattern.logger.AbstractLogger;
import com.design.pattern.chainOfResponsibilityPattern.logger.InfoLogger;

/**
 * @Classname MainStarter
 * @Description 责任链模式启动类
 * 责任链模式的的思想是把发送者和接收者进行解耦，当有多个接收者的时候以链表的方式讲这些接收者串在一起，从而形成只有头部接收者和发送者进行耦合
 * 下面以一个日志分级系统作为示例
 * @Date 2021/3/17 15:52
 * @Created by xupen
 */
public class MainStarter {
    public static void main(String[] args) {
        AbstractLogger logger = new InfoLogger();
        logger.info("常规打印");
        logger.error("这算是错误信息！");
        logger.debug("哈哈");
    }
}