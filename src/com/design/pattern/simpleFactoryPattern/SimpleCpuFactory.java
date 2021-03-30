package com.design.pattern.simpleFactoryPattern;

/**
 * @Author xupeng
 * @Description 简单工厂模式
 * @Date 2019/5/31 17:12
 */
public class SimpleCpuFactory {
    /**
     * 静态工厂
     * @param type
     * @return
     */
    public static CPU createCPU(int type){
        CPU cpu = null;
        switch(type) {
            case 1:
                cpu = new AMDCpu(939);
                break;
            case 2:
                cpu = new IntelCpu(1151);
                break;
            default:
        }
        return cpu;
    }

    /**
     * 工厂模式
     * @param type
     * @return
     */
    public CPU create(int type){
        switch(type) {
            case 1:
                return new AMDCpu(939);
            case 2:
                return new IntelCpu(1151);
            default:
        }
        return null;
    }

    public static void main(String[] args) {
        CPU cpu1 = SimpleCpuFactory.createCPU(1);
        cpu1.calculate();
        CPU cpu2 = new SimpleCpuFactory().create(2);
        cpu2.calculate();
    }
}