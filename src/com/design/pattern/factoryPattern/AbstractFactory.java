package com.design.pattern.factoryPattern;

/**
 * @Classname AbstractFactory
 * @Description
 * @Date 2021/3/27 19:42
 * @Created by white
 */
public abstract class AbstractFactory {
    abstract CPU getCPU(int pins);
    abstract MainBoard getMainBoard(int holes);
}