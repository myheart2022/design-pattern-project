package com.design.pattern.proxyPattren;

/**
 * @Classname MainStarter
 * @Description
 * @Date 2021/3/31 17:24
 * @Created by white
 */
public class MainStarter {
    public static void main(String[] args) {
        CircleProxy circleProxy = new CircleProxy();
        circleProxy.draw();
        circleProxy.erase();

        //jdk动态代理
        System.out.println();
        CircleProxyHandler handler = new CircleProxyHandler();
        Shape shape = (Shape)handler.newProxyInstance(new Circle());
        shape.draw();
        shape.erase();

        //使用jdk动态代理扩展其他图形而不用增加代理类
    }
}