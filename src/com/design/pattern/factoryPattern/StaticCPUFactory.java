package com.design.pattern.factoryPattern;

/**
 * @Classname StaticCPUFactory
 * @Description
 * @Date 2021/3/28 1:53
 * @Created by white
 */
public class StaticCPUFactory {
    public static CPU getCpu(int pins){
        if(pins==938){
            return new AMDCpu(pins);
        }else {
            return new IntelCpu(pins);
        }
    }
}