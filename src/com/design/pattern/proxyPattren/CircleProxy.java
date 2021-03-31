package com.design.pattern.proxyPattren;

/**
 * @Classname CircleProxy
 * @Description
 * @Date 2021/3/31 17:17
 * @Created by white
 */
public class CircleProxy implements Shape {
    private Circle circle;
    CircleProxy(){
    }
    private void loadCircle(){
        if(circle==null){
            System.out.println("使用代理类创建Circle对象");
            circle = new Circle();
        }
    }
    @Override
    public void draw() {
        loadCircle();
        System.out.print("用铅笔");
        circle.draw();
    }

    @Override
    public void erase() {
        loadCircle();
        System.out.print("用橡皮擦");
        circle.erase();
    }
}