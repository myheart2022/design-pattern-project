package com.design.pattern.factoryPattern;

/**
 * @Classname AmdFactory
 * @Description
 * @Date 2021/3/27 18:46
 * @Created by white
 */
public class AmdFactory extends AbstractFactory {
    @Override
    CPU getCPU(int pins) {
        return new AMDCpu(pins);
    }

    @Override
    MainBoard getMainBoard(int holes) {
        return new GAMainBoard(holes);
    }
}