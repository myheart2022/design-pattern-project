package com.design.pattern.factoryPattern;

/**
 * @Classname IntelFactory
 * @Description
 * @Date 2021/3/27 21:34
 * @Created by white
 */
public class IntelFactory extends AbstractFactory {
    @Override
    CPU getCPU(int pins) {
        return new IntelCpu(pins);
    }

    @Override
    MainBoard getMainBoard(int holes) {
        return new MSIMainBoard(holes);
    }
}