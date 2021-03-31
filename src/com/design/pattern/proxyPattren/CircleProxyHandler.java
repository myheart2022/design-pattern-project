package com.design.pattern.proxyPattren;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname CircleProxyHandler
 * @Description
 * @Date 2021/3/31 17:37
 * @Created by white
 */
public class CircleProxyHandler implements InvocationHandler {
    private Object object = null ;

    public Object newProxyInstance(Object realObj){
        this.object = realObj;
        Class<?> classType = this.object.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print("使用JDK动态代理执行");
        method.invoke(object, args);
        return null;
    }
}